/*********************************************************
 * methTestTP3
 * smtp
 * Server.java	
 * (c)methTestTP3 on 16 nov. 2013 01:12:30
 * By ken
 * Update 16 nov. 2013 01:12:30
*********************************************************/
package smtp;

import java.net.Socket;

/**
 * @author ken
 *
 */
public class Server implements ServerInterface{

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#start()
	 */
	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#stop()
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#waitConnexion()
	 */
	@Override
	public Socket waitConnexion() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#SMTPTreatment()
	 */
	@Override
	public void SMTPTreatment() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#read()
	 */
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see smtp.ServerInterface#write()
	 */
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

}
