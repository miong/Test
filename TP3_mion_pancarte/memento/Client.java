

public class Client implements ClientInterface{

	private VersionManagerInterface manager;
	private GuardianInterface guardian;
	Position p;
	
	
	public Client(GuardianInterface g,VersionManagerInterface v,int x,int y){
		manager=v;
		guardian=g;
		p = new Position(x,y);
	}
	
	public int save(){
		manager.setState(p);
		Memento m = manager.saveInMemento();
		return guardian.addMemento(m);
	}
	
	public void restore(int ID){
		Memento m = guardian.getMemento(ID);
		manager.restoreFromMemento(m);
		p = manager.getState();
	}
	
	
	
}
