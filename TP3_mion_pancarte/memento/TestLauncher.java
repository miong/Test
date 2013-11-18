import junit.textui.*;


public class TestLauncher {
	
	public static void main(String[] args) {
	    if(args.length==0)
		System.out.println("Veuiller specifier la class de test");
	    else{
		TestRunner ts = new TestRunner();
		if(args[0].equals("Client");
			ts.run(TestClient.class);
		if(args[0].equals("Guardian");
			ts.run(TestGuardian.class);
		if(args[0].equals("VersionManager");
			ts.run(TestVersionManager.class);
	}

}
