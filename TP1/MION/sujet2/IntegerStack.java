
public class IntegerStack {

	private int[] tab;
	private int size;
	
	public int getSize() {
		return size;
	}
	public int[] getTab(){
		return tab;
	}
	
	
	public IntegerStack() {
		size=0;
		tab=new int[10];
	}
	public void push(int i){
		if (size==tab.length){
			resize();
		}
		tab[size]=i;
		size++;
	}
	private void resize(){
		int[]tmp=new int[2*tab.length];
		for (int i=0;i<size;i++){
			tmp[i]=tab[i];
		}
		tab=tmp;
	}
	public int pop(){
		int tmp = 0;
		if (size>0){
			tmp=tab[size-1];
			tab[size-1]=0;
			size--;
		}
		return tmp;
	}
	public int count(){
		return size;
	}
}
