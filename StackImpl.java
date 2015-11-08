/**
* Class extending AbstractStack
* @author abrait02 BBK-PiJ-2015-81
*/


public class StackImpl extends AbstractStack {
	
	/**
	* Constructor to take in a List.
	*/
	
	public StackImpl(List list) {
		// Call parent AbstractStack's constructor to put list in internalList.
		super(list);
	}
	

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