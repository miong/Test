package memento;

public class Client {

	private VersionManagerInterface manager;
	private GuardianInterface guardian;
	Position p;
	
	
	public Client(GuardianInterface g,VersionManagerInterface v,int x,int y){
		manager=v;
		guardian=g;
		p = new Position(x,y);
	}
	
	public void save(){
		manager.setState(p);
		Memento m = manager.saveInMemento();
		guardian.addMemento(m);
	}
	
	
	
}
