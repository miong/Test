package smtp;

import java.net.Socket;

public interface ServerInterface {
	
	public boolean start();
	
	public void stop();
	
	public Socket waitConnexion();
	
	public void SMTPTreatment();
	
	public String read();
	
	public void write();

}
