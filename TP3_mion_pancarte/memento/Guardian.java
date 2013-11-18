

import java.util.TreeMap;



public class Guardian implements GuardianInterface{
	
	private int nextId = 0;
	private TreeMap<Integer,Memento> saved = new TreeMap<Integer,Memento>();
	
	@Override
	public int addMemento(Memento m) {
		int id = nextId;
		nextId++;
		saved.put(id,m);
		return id;
	}

	@Override
	public Memento getMemento(int ID) {
		Memento m = saved.get(ID);
		return m;
	}
	
	public int getNumberOfSavedObject(){
		return saved.size();
	}

}
