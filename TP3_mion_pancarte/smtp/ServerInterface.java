package smtp;

import java.net.Socket;

public interface ServerInterface {
	
	public void start();
	
	public Socket waitConnexion();
	
	public void SMTPTreatment();
	
	public String read();
	
	public boolean write(String s);

}
