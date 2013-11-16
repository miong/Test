package smtp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread implements ServerInterface{

	ServerSocket server;
	Socket client;
	BufferedInputStream readableStream;
    BufferedOutputStream writableStream;
    boolean running;
    
    public Server(int port){
    	try{
    		server = new ServerSocket(port);
    		client = null;
        	readableStream = null;
            writableStream = null;
            running = false;
    	}catch (Exception e){
    		e.printStackTrace();
    	}
    	
    }
    
    
    public void run(){
    	running = true;
    	while(running){
    		try{
    			client = waitConnexion();
    			readableStream = new BufferedInputStream(client.getInputStream());
    			writableStream = new BufferedOutputStream(client.getOutputStream());
    			SMTPTreatment();
    			client.close();
    			client = null;
    			readableStream = null;
    			writableStream = null;
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}
	}
    
    public void SMTPTreatment() {
		
		
	}
    
    public void tryToStop(){
    	running = false;
    }

	public Socket waitConnexion() {
		try {
			return server.accept();
		} catch (IOException e) {
			return null;
		}
	}

	
	public String read() {
		String response = "";
		int readed=0;
		if(client != null){
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
	


	public boolean write(String s) {
		if(client != null){
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

}
