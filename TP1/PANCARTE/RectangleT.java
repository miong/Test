
public class RectangleT {
	int xmin;
	int xmax;
	int ymin;
	int ymax;
	
	public RectangleT(int a, int b, int c, int d){
		if(a<b){
			xmin=a;
			xmax=b;
		}
		else{
			xmin=b;
			xmax=a;
		}
		if(c<d){
			ymin=c;
			ymax=d;
		}
		else{
			ymin=d;
			ymax=c;
		}
		
		
	}
}
