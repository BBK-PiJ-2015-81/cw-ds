/**
* Class implementing ImprovedStack.
* @author abrait02 BBK-PiJ-2015-81
*/

public class ImprovedStackImpl implements ImprovedStack {
	
	private List internalList;
	
	//Constructor
	
	public ImprovedStackImpl(List list) {
	  this.internalList = list;
    }
	
	
	/**
	 * Returns a copy of this stack with the items reversed, the top
	 * elements on the original stack is at the bottom of the new
	 * stack and viceversa.
	 * 
	 * @return a copy of this stack with the items reversed. 
	 */
	public ImprovedStack reverse(){
		
		return null;
		
	}

	/**
	 * Removes the given object from the stack if it is
	 * there. Multiple instances of the object are all removed.
	 *
	 * Classes implementing this method must use method .equals() to
	 * check whether the item is in the stack or not.
	 * 
	 * @param object the object to remove
	 */
	public void remove(Object object) {
		
		
		
	}
	
	
	
	
	
	
	
	// Implemented Stack Methods from StackImpl
	
	public boolean isEmpty() {
		if (internalList.isEmpty() == true){
			return true;
		} else {
			return false;
		}
	}


	public int size() {
		return internalList.size();
	}

	
	public void push(Object item) {
		internalList.add(item);
	}


	public ReturnObject top(){
		
		ReturnObject objReturned = null;
		
		if (internalList.isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
		// Pick up the element with the highest index, i.e. the last one added at the end
			objReturned = new ReturnObjectImpl(internalList.get(internalList.size() - 1).getReturnValue());
		}
		return objReturned;
	}


	public ReturnObject pop(){
		
		ReturnObject objReturned = null;
		
		if (internalList.isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			new ReturnObjectImpl(internalList.remove(internalList.size() - 1).getReturnValue());
		}
		return objReturned;
	}
	
}