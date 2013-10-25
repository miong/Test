public class Line {
	
	static double precision=0.0001;
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
	
	public boolean parrallele(Line l){
		
		int abscisseVecteurX1= this.x2-this.x1;
		int ordonneeVecteurY1= this.y2-this.y1;
		
		int abscisseVecteurX2= l.x2-l.x1;
		int ordonneeVecteurY2= l.y2-l.y1;
		
		double rapportVecteurX=(double)abscisseVecteurX2/(double)abscisseVecteurX1;
		double rapportVecteurY=(double)ordonneeVecteurY2/(double)ordonneeVecteurY1;
		
		if(  ((rapportVecteurX-rapportVecteurY)<precision) && ((rapportVecteurX-rapportVecteurY)>-precision)  ){
			return true;
		}
		return false;
	}
	
	
	public boolean intersecte(Line l){
		if( this.parrallele(l) ){
			//les vecteurs directeurs des droites sont paralleles
			Line lineDefinieParUnPointDeChaqueDroites = new Line(this.x1,this.y1,l.x1,l.y1);
			
			if( this.parrallele(lineDefinieParUnPointDeChaqueDroites)){
				return true;
			}
			return false;
		}
		return true;
	}
}
