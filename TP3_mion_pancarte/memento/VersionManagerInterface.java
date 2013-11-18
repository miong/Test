public interface VersionManagerInterface {

	// save the current state into a Memento
	public Memento saveInMemento();
	
	// restore the state contained in the Memento m
	public void restoreFromMemento(Memento m);
	
	//Set the internal state of the VersionManager
	public void setState(Position p);
	
	//Get the internal state of the VersionManager
	public Position getState();
	
}
