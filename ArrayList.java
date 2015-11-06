/**
* Implementation of List Interface based on arrays called ArrayList.
* @author abrait02 BBK-PiJ-2015-81
*/

public class ArrayList implements List {


	/**
	* Set the size of the array
	*/
	private int objArraySize = 0;
	
	
	/**
	* The array of Objects.
	*/
	private Object[] objArray = new Object[objArraySize];
	
	public boolean isEmpty() {
		if (objArray.length == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public int size() {
		return objArray.length;
	}


	public ReturnObject get(int index){
		
		ReturnObject objReturned;
		
		if (isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			objReturned = new ReturnObjectImpl(objArray[index]);
		}
		return objReturned;
	}
	
	
	public ReturnObject remove(int index) {
		
		ReturnObject objReturned;
		
		if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else {
			objReturned = new ReturnObjectImpl(objArray[index]);
		}
		
		/**
		*Rebuild the objArray excluding removed Object.
		*/
		for (int i = index; i < size(); i++) {
			objArray[i] = objArray[i+1];
		}
		
		return objReturned;
		
	}	
	
	
	public ReturnObject add(int index, Object item)	{
		
		ReturnObject objReturned;
		
		if (index < 0 || index >= size()) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else if (item == null) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			/**
			*The empty return object we'll return as we haven't errored
			*/
			objReturned = new ReturnObjectImpl(null);
			
			
			/**
			* Increase the array size by 1 so we have space
			*/
			Object[] tempArray = new Object[size()+1];
			
			/**
			* Increase the index by 1 for items after where we add.
			*/
			for (int i = size(); i > index; i-- ) {
				tempArray[i] = tempArray[i+1];
			}
		
			/**
			* Add the new element
			*/
			tempArray[index] = item;
			objArray = tempArray;
			}
	
			return objReturned;
	}
	
	
	public ReturnObject add(Object item){
		
		ReturnObject objReturned;
		
		if (item == null) {
			objReturned = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			/**
			*The empty return object we'll return as we haven't errored
			*/
			objReturned = new ReturnObjectImpl(null);
			
			/**
			* Increase the array size by 1 so we have space
			*/
			Object[] tempArray = new Object[size()+1];
			
			/**
			* Add the new element to the final index
			*/
			tempArray[size()-1] = item;
			objArray = tempArray;
		}
		
		return objReturned;
	}
}