/**
* Implementation of List Interface based on pointers.
* @author abrait02 BBK-PiJ-2015-81
*/

public class LinkedList implements List {
	
	
	private int listSize = 0;
	private ListNode firstItem;
	private ListNode lastItem;
	 
	 
	public boolean isEmpty(){
		if (listSize == 0) {
			return true;
		} else {
			return false;
		}		
	}


	public int size(){
		return listSize;
	}


	public ReturnObject get(int index){
		
		//Not sure why this objReturned needs to be initialised when the others didn't. Investigate.
		ReturnObject objReturned = null;
		
		if (isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			if (index == 0) {
				objReturned = new ReturnObjectImpl(firstItem);
			} else if (index == (listSize - 1)) {
				objReturned = new ReturnObjectImpl(lastItem);
			} else {
				ListNode tempNode = firstItem;
				for (int i = 0; i < index; i++){
					
					// move through the list.
					tempNode = tempNode.getNext();
					objReturned = new ReturnObjectImpl(tempNode);
				}
			} 			
		} 
		return objReturned;
	}
	
	
	public ReturnObject remove(int index){
		
		ReturnObject objReturned;
		
		if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			objReturned = get(index);
			// If we remove the only object reset firstItem, lastItem.
			if (size() == 1) {
				firstItem = null; 
				lastItem = null;
			} else {
				//Move to one item before the item being removed.
				ListNode tempNode = firstItem;
				for (int i = 0; i < (index - 1); i++) {
					tempNode = tempNode.getNext();
				}
				// If the item being removed is the lastItem, make the one before the new lastItem;
				if (tempNode.getNext().getNext() == null){
					tempNode.setNext(null);
				} else {
				// Point the item before the item being removed to the item after that.	
					tempNode.setNext(tempNode.getNext().getNext());
				}
			}
		}
		// Update the list size as we removed an item.
		listSize = listSize - 1;
		return objReturned;
		
	}

	/**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	public ReturnObject add(int index, Object item){
		return null;
	}

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         or containing an appropriate error message otherwise
	 */
	public ReturnObject add(Object item){
		return null;
	}
}