
package smtp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Client implements ClientInterface{

    Socket toServer = null;
    BufferedInputStream readableStream = null;
    BufferedOutputStream writableStream = null;
	
	public boolean connectTo(String hostname, int port) {
		try{
			toServer = new Socket(hostname,port);
			readableStream = new BufferedInputStream(toServer.getInputStream());
			writableStream = new BufferedOutputStream(toServer.getOutputStream());
			return toServer.isConnected();
		}catch(Exception e){
			toServer = null;
			return false;
		}
	}

	public boolean sendMessage(String s) {
		if(toServer != null){
			try {
				writableStream.write(s.getBytes());
				writableStream.flush();
				return true;
			} catch (IOException e) {
				return false;
			}
			
		}
		return false;
	}

	public String readResponse() {
		String response = "";
		int readed=0;
		if(toServer != null){
			do{
				try {
					readed = readableStream.read();
				} catch (IOException e) {}
				if(readed >0 )
					response += (char) readed;
			}while(readed != -1);
		}
		return response;
	}

}
