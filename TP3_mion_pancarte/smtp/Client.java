

public class Client implements ClientInterface{

    Connexion toServer;
    
    public Client(Connexion t){
    	toServer = t;
    }

	public boolean sendMessage(String s) {
		if(toServer != null){
			toServer.write(s);
			return true;
		}
		return false;
	}

	public String readResponse() {
		return toServer.read();
	}

}
