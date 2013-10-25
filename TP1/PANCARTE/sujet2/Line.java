package LineTest;

public class Line {
	int x1;
	int x2;
	int y1;
	int y2;
	
	public Line(int a,int b, int c, int d){
		x1=a;
		y1=b;
		x2=c;
		y2=d;
	}
	
	
	public boolean intersecte(Line l){
		double precision= 0.000001;
		
		int abscisseVecteurX1= this.x2-this.x1;
		int ordonneeVecteurY1= this.y2-this.y1;
		
		int abscisseVecteurX2= l.x2-l.x1;
		int ordonneeVecteurY2= l.y2-l.y1;
		
		double rapportVecteurX=(double)abscisseVecteurX2/(double)abscisseVecteurX1;
		double rapportVecteurY=(double)ordonneeVecteurY2/(double)ordonneeVecteurY1;
		
		if(  ((rapportVecteurX-rapportVecteurY)<precision) && ((rapportVecteurX-rapportVecteurY)>-precision)  ){
			//les vecteurs directeurs des droites sont paralleles
			int abscisseVecteurX3= this.x2-l.x1;
			int ordonneeVecteurY3= this.y2-l.y1;
			double rapportVecteurY3=(double)ordonneeVecteurY3/(double)ordonneeVecteurY1;
			double rapportVecteurX3=(double)abscisseVecteurX3/(double)abscisseVecteurX1;
			
			if(  ((rapportVecteurX3-rapportVecteurY3)<precision) && ((rapportVecteurX3-rapportVecteurY3)>-precision)  ){
				return true;
			}
			
			return false;
		}
		
		return true;
		
	}
}
