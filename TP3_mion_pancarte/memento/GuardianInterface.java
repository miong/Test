package memento;

public interface GuardianInterface {
	
	// stock the memento and return its ID
	public int addMemento(Memento m);
	
	// retrieve the Memento with the id:ID from the guardian
	public Memento getMemento(int ID);

}
