/**
* Implementation of FunctionalList Interface that extends LinkedList.
* @author abrait02 BBK-PiJ-2015-81
*/

public class FunctionalLinkedList extends LinkedList implements FunctionalList  {
	
	
	public ReturnObject head(){
		
		ReturnObject objReturned;
		if (isEmpty() == true){
			objReturned = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else {
			objReturned = new ReturnObjectImpl(get(0).getReturnValue());
		}
		return objReturned;
	}


    public FunctionalList rest(){
		
		FunctionalList elementList = new FunctionalLinkedList();
		if (size() > 0){
			for (int i = 1; i < size(); i++) {
				elementList.add(get(i).getReturnValue());
			}
		}
		return elementList;	
	}
}