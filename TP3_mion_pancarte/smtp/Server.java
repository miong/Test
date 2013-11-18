
public class Server implements ServerInterface{

	Connexion client;
    boolean running;
    int step=0;
    
    public Server(){
    	client = null;
    	running = false;
    		
    }
    
    
    public void start(){
    	this.run();
    }
    
    public void run(){
    	running = true;
    	while(running){
    		try{
    			waitConnexion();
    			SMTPTreatment();
    			client.close();
    			client = null;
    		}catch (Exception e){
    			e.printStackTrace();
    		}
    	}
	}
    
    public void SMTPTreatment() {
    	String readed;
    	do{
    		readed= this.read();
    		subTreatment(readed);
    	}while(!readed.equals("QUIT"));
    	
    }
    	
    public void subTreatment(String msg){
    	if(msg.equals("QUIT")){
    		step=0;
    		running = false; // pour le test on ne fait qu'une connexion
    		return;
    	}
    	switch(step){
    	case 0: if(msg.startsWith("HELO")){
    				write("OK");
    				step++;break;
    			}else{
    				write("Error: HELO missing");break;
    			}
    	case 1: if(msg.startsWith("MAIL FROM")){
					write("OK");step++;break;
    			}else{
    				write("Error: MAIL FROM missing");break;
    			}
    	case 2: if(msg.startsWith("RCPT TO")){
					write("OK");step++;break;
				}else{
					write("Error: RCPT TO missing");break;
				}
    	case 3: if(msg.startsWith("DATA")){
					write("OK READY TO READ MAIL CONTANTS. PLEASE END WITH . ON A SIGLE LIGNE");step++;break;
				}else{
					write("Error: DATA missing");break;
				}
    	case 4: if(msg.equals(".")){
    				write("OK MAIL SENT");step=1;break;
				}else{
					break;
				}
    	
    	}
    }
		
		
	
    
    public void tryToStop(){
    	running = false;
    }

	public void waitConnexion() {
		while(client==null);
	}

	
	public String read() {
		return client.read();
	}
	


	public boolean write(String s) {
		if(client != null){
			client.write(s);
			return true;
		}
		return false;
		
	}

}
