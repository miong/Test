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
	
	public int aire(){
		return (xmax-xmin)*(ymax-ymin);
	}
	
	public int perimetre(){
		return 2*((xmax-xmin)+(ymax-ymin));
	}
	
	public boolean overlap(RectangleT r){
		if((r.xmin<= this.xmax )&& (r.xmin >=this.xmin) && (r.ymin <= this.ymax) && (r.ymin>= this.ymin)){
			return true;
		}
		
		if((r.xmax<= this.xmax )&& (r.xmax >=this.xmin) && (r.ymax <= this.ymax) && (r.ymax>= this.ymin)){
			return true;
		}
		
		
		if((r.xmax<= this.xmax )&& (r.xmax >=this.xmin) && (r.ymin <= this.ymax) && (r.ymin>= this.ymin)){
			return true;
		}
		
		
		if((r.xmin<= this.xmax )&& (r.xmin >=this.xmin) && (r.ymax <= this.ymax) && (r.ymax>= this.ymin)){
			return true;
		}
		
		return false;
	}
}
