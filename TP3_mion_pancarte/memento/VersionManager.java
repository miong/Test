package memento;

public class VersionManager implements VersionManagerInterface {

	private Position state;
	
	@Override
	public Memento saveInMemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void restoreFromMemento(Memento m) {
		// TODO Auto-generated method stub
		
	}

	public Position getState() {
		return state;
	}

	public void setState(Position state) {
		this.state = state;
	}
	
	

}
