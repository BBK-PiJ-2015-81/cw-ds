// Testing push from IntelliJ

public class TestScript {
	
	public static void main(String[] args) {
		
	TestScript launcher = new TestScript();
	launcher.launch();
	
	}

	private void launch() {
		
		System.out.println("");
		System.out.println("===================");
		System.out.println("Started TestScript!");
		System.out.println("===================");
		
		Object myObject = new Object();
		ReturnObject myObjectReturned = new ReturnObjectImpl(myObject);

		
		
		System.out.println(myObjectReturned.hasError());
		System.out.println(myObjectReturned.getError());
		System.out.println(myObjectReturned.getReturnValue());

	
	}
}