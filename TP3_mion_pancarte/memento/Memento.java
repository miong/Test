package memento;

public class Memento {
	
	private Position p;
	
	public Memento(Position p){
		this.p=p;
	}
	
	public Position getPosition(){
		return p;
	}

}
