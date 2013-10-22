import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HTTP_Serveur_Test {
	
	Socket client;
	BufferedOutputStream bos;
	BufferedInputStream bis;
	
	
	@Test
	public void HeadRequestResponse(){
		try{
			client = new Socket("localhost",8080);
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			bos = new BufferedOutputStream(out);
			bis = new BufferedInputStream(in);
			Thread t = new Thread(new Runnable(){

				@Override
				public void run() {
					HTTP_Serveur hs;
					try {
						Thread.sleep(5000);
						hs = new HTTP_Serveur();
						hs.start();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			});
			t.start();
			byte[] array = new byte[256];
			String req = "HEAD test";
			String rep = "";
			String expected = "HTTP/1.0 200 OK \n" +
					"Content-Type : text/HTML\n";
			bos.write(req.getBytes());
			bos.flush();
			Thread.sleep(5000);
			while(bis.available()>0){
				bis.read(array,0,256);
				rep += new String(array);
			}
			assertEquals("reponse du serveur sur une requette Head",expected,rep);
		}catch(Exception e){}
		
	}
	

}
