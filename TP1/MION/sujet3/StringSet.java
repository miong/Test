public class StringSet {
	private int size;
	private String[] tab;
	
	public int getSize(){
		return size;
	}
	
	public String[] getTab(){
		return tab;
	}
	
	public StringSet(){
		tab= new String[10];
		size=0;
	}
	
	
	
	public void add(String ajout){
		if(this.contains(ajout))
			return;
		if (size==tab.length){
			reSize();
		}
		tab[size]=ajout;
		size++;
	}
	
	private void reSize(){
		String[] tmp =new String[2*size];
		for(int i=0;i<size;i++){
			tmp[i]=tab[i];
		}
		tab=tmp;
	}
	
	public boolean contains(String s){
		for(int i=0;i<size;i++){
			if(tab[i]==s){
				return true;
			}
		}
		return false;
	}
	
	public void remove(String s){
		int ind;
		for(ind=0;ind<size;ind++){
			if(tab[ind]==s)
				break;
		}
		if(ind == size)
			return;
		for(int i=ind;i<size-1;i++)
			tab[i]=tab[i+1];
		size--;
	}
	
	public int count(){
		return size;
	}
}
