

import junit.textui.*;

public class TestLauncher {
	
	public static void main(String[] args) {
		TestRunner ts = new TestRunner();
			ts.run(testClient.class);
			ts.run(testServer.class);
	    
	}

}
