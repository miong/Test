
public class Position {
	
	private int x;
	private int y;
	
	public Position(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public boolean equals(Object o){
		if(!(o instanceof Position))
			return false;
		Position p2 = (Position) o;
		return x==p2.x && y==p2.y;
	}

}
