
public class TestScript {
	
	public static void main(String[] args) {
		
	TestScript launcher = new TestScript();
	launcher.launch();
	
	}

	private void launch() {
	
		System.out.println("Started TestScript!");
		Object myObject = new Object();
		ErrorMessage testError = ErrorMessage.NO_ERROR();
		
		System.out.println(testError);
	
	}
}