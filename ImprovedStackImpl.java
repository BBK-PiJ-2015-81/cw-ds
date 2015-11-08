/**
* Class implementing ImprovedStack.
* @author abrait02 BBK-PiJ-2015-81
*/

public class ImprovedStackImpl implements ImprovedStack {
	
	protected List internalList;
	
	//Constructor
	
	public ImprovedStackImpl(List list) {
	  this.internalList = list;
    }
	
	
	public ImprovedStack reverse(){
		
		List tempList = new ArrayList();
		
		ImprovedStackImpl reverseStack = new ImprovedStackImpl(tempList);
		// Start at the top of the stack and build a new one with 
		// the old top being the new bottom.
		for (int i = (internalList.size() - 1); i >= 0; i--) {
			reverseStack.push(internalList.get(i).getReturnValue());
		}
		return reverseStack;
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
		// Check if the object being removed exists at each index
		for ( int i = 0; i < internalList.size(); i++) {
			if (internalList.get(i).getReturnValue().equals(object)) {
				// if we find the object being removed, 
				// use the remove method to delete it cleanly
				internalList.remove(i);
			} else {
				// just move on to checking the next index
				i++;			
			}
		}
		
		
	}
		
	
	// Implemented Stack Methods from StackImpl.
	
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