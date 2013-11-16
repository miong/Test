
package smtp;


public class Client implements ClientInterface{

	/* (non-Javadoc)
	 * @see smtp.ClientInterface#connectTo(java.lang.String, int)
	 */
	@Override
	public boolean connectTo(String hostname, int port) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see smtp.ClientInterface#sendMessage(java.lang.String)
	 */
	@Override
	public void sendMessage(String s) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see smtp.ClientInterface#readResponce()
	 */
	@Override
	public String readResponce() {
		// TODO Auto-generated method stub
		return null;
	}

}
