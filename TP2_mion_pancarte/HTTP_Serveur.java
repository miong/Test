import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;


public class HTTP_Serveur {
	
	int port = 8080;
	ServerSocket ss;
	Socket client;
	byte[] buffer = new byte[256];
	
	public HTTP_Serveur() throws IOException{
		ss = new ServerSocket(port);
	}
	
	public void start(){
		while(true){
			try {
				String req="";
				client = ss.accept();
				System.out.println("Client accepter !");
				OutputStream out = client.getOutputStream();
				InputStream in = client.getInputStream();
				BufferedOutputStream bos = new BufferedOutputStream(out);
				BufferedInputStream bis = new BufferedInputStream(in);
				Thread.sleep(5000);
				while(bis.available()>0){
					System.out.println("Lecture de données");
					bis.read(buffer,0,256);
					String lec = new String(buffer);
					req += lec;
				}
				System.out.println("req : "+req+"\n");
				if(req.startsWith("HEAD ")){
					String rep = "HTTP/1.0 200 OK \n" +
							"Content-Type : text/HTML\n";
					bos.write(rep.getBytes());
					bos.flush();
				}else if(req.startsWith("GET ")){
					String rep = "HTTP/1.0 200 OK \n" +
							"Content-Type : text/HTML\n" +
							"\n" +
							"<html>\n" +
							"	<body\n>" +
							"		HELLO WOLRD<br>\n" +
							"	</body>\n" +
							"</html>\n";
					bos.write(rep.getBytes());
					bos.flush();
					System.out.println("Hello World envoyé");
				}else{
					String bad_req = "400 Bad Request\n";
					bos.write(bad_req.getBytes());
					bos.flush();
					System.out.println("Bad request envoyé");
				}
				Thread.sleep(250);
				req ="";
				client.close();
				System.out.println("Client fermer");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		try{
			HTTP_Serveur hs = new HTTP_Serveur();
			hs.start();
		}catch(Exception e){}
	}

}
