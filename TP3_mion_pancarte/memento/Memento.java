package memento;

public class Memento {
	
	private Position p;
	
	public Memento(Position p){
		this.p=p;
	}
	
	public Position getPosition(){
		return p;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Memento))
			return false;
		Memento m = (Memento) o;
		return p.equals(m.p);
	}

}
