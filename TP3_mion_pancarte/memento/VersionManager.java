public class VersionManager implements VersionManagerInterface {

	private Position state;
	
	@Override
	public Memento saveInMemento() {
		Memento rep = new Memento(state);
		return rep;
	}

	@Override
	public void restoreFromMemento(Memento m) {
		state = m.getPosition();
	}

	public Position getState() {
		return state;
	}

	public void setState(Position s) {
		state = s;
	}
	
	

}
