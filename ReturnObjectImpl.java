/**
* Implementation of ReturnObject Interface
* @author abrait02 BBK-PiJ-2015-81
*/

public class ReturnObjectImpl implements ReturnObject {
	
	/**
	* The error message returned.
	*/
	private ErrorMessage errorReturned;
	
	/**
	* The object returned if we don't error.
	*/
	private Object objReturned;
	
	
	public boolean hasError(){
		if (errorReturned.equals(ErrorMessage.NO_ERROR)) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public ErrorMessage getError(){
		return errorReturned;
	}
	
	
	public Object getReturnValue(){
		if (hasError() == true) {
			return null;
		} else {
			return objReturned;
		}
	
		
	}
	
	
}