

import junit.textui.*;

public class TestLauncher {
	
	public static void main(String[] args) {
		TestRunner ts = new TestRunner();
			ts.run(TestClient.class);
			ts.run(TestGuardian.class);
			ts.run(TestVersionManager.class);
	    
	}

}
