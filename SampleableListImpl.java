/**
* Implementation of SampleableList Interface.
* @author abrait02 BBK-PiJ-2015-81
*/

public class SampleableListImpl extends ArrayList implements SampleableList {
// Extend ArrayList to pick up methods.


	public SampleableList sample(){
		
		SampleableList listReturned = new SampleableListImpl();
		
		if (size() > 0){
		
		// Traverse the list adding elements with an even index to listReturned
		// i.e. index 0 is 1st item, index 2 is 3rd item etc.
			for (int i = 0; i < size(); i++){
				if (i % 2 == 0){
					listReturned.add(get(i).getReturnValue());
				}
			}
		}
		return listReturned;
	}
	
}