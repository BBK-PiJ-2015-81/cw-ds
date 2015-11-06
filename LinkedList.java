/**
* Implementation of List Interface based on pointers called LinkedList.
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
					// move to the next ListNode and update my position in the list.
					tempNode = tempNode.getNext();
					objReturned = new ReturnObjectImpl(tempNode);
				}
			}			
		}
		return objReturned;
	}
	
	
	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject remove(int index){
		return null;
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