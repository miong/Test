
package smtp;

public interface ClientInterface {
	
	public boolean connectTo(String hostname, int port);
	
	public void sendMessage(String s);
	
	public String readResponce();
	
}
