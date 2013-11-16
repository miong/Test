
package smtp;

public interface ClientInterface {
	
	public boolean connectTo(String hostname, int port);
	
	public boolean sendMessage(String s);
	
	public String readResponse();
	
}
