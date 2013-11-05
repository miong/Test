package memento;

public class Client {

	private VersionManagerInterface manager;
	private GuardianInterface guardian;
	private int x;
	private int y;
	
	
	public Client(GuardianInterface g,VersionManagerInterface v,int x,int y){
		manager=v;
		guardian=g;
		this.x = x;
		this.y = y;
	}
	
	public void save(){
		
	}
	
	
	
}
