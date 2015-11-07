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
		
		//Not sure why this objReturned needs to be initialised. Investigate.
		ReturnObject objReturned = null;
		
		if (isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (index == 0) {
			objReturned = new ReturnObjectImpl(firstItem);
		} else if (index == (listSize - 1)) {
			objReturned = new ReturnObjectImpl(lastItem);
		} else {
			ListNode positionNode = firstItem;
			for (int i = 0; i < index; i++){
					
			// move through the list to our desired index.
			positionNode = positionNode.getNext();
			objReturned = new ReturnObjectImpl(positionNode);
				}
			} 			
		return objReturned;
		} 
		
	
	
	
	public ReturnObject remove(int index){
		
		ReturnObject objReturned = null;
		
		if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			objReturned = get(index);
			// If we remove the only object then reset firstItem, lastItem.
			if (size() == 1) {
				firstItem = null; 
				lastItem = null;
			} else {
				//Move to one item before the item being removed.
				ListNode positionNode = firstItem;
				for (int i = 0; i < (index - 1); i++) {
					positionNode = positionNode.getNext();
				}
				// If the item being removed is the lastItem, make the one before the new lastItem;
				if (positionNode.getNext().getNext() == null){
					positionNode.setNext(null);
				} else {
				// Point the item before the item being removed to the item after that.	
					positionNode.setNext(positionNode.getNext().getNext());
				}
			}
		}
		// Update the list size as we removed an item.
		listSize = listSize - 1;
		return objReturned;
		
	}


	public ReturnObject add(int index, Object item){
		
		ReturnObject objReturned = null;
		
		if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			ListNode positionNode = null;
			ListNode addedNode = new ListNode(item);
			
			if (isEmpty() == true) {
				firstItem = addedNode;
				lastItem = firstItem;			
			} else if (index == 0) {
				// Put in front of the current first item.
				positionNode.setNext(firstItem);
				// Make the new first item.
				firstItem = positionNode;
			} else {
				// Go to the item before where we want to insert
				positionNode = firstItem;
				for (int i = 0; i < (index - 1); i++) {
					positionNode.setNext(positionNode.getNext());
				}
				
				addedNode.setNext(positionNode.getNext());
				positionNode.setNext(addedNode);
			}
		}
		listSize = listSize + 1;
		return objReturned;
	}
	
	
	public ReturnObject add(Object item){
		
		ReturnObject objReturned = null;
		ListNode addedNode = new ListNode(item);
		
		if (item == null) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (isEmpty() == true) {
			firstItem = addedNode;
			lastItem = firstItem;	
		} else {
			lastItem.setNext(addedNode);
			lastItem = addedNode;
		}
		listSize = listSize + 1;
		return objReturned;
		
	}
}