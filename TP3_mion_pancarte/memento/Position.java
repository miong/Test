package memento;

public class Position {
	
	private int x;
	private int y;
	
	public Position(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Position p2){
		return x==p2.x && y==p2.y;
	}

}
