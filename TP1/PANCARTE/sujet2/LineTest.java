import static org.junit.Assert.*;
import junit.frameworks.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineTest extends TestCase {
	
	
	//test constructeur
	
	@Test
	public void LineConstructeurTest(){
		Line lNormale=new Line(1,1,2,2);
		assertEquals(lNormale.x1,1);
		assertEquals(lNormale.y1,1);
		assertEquals(lNormale.x2,2);
		assertEquals(lNormale.y2,2);
	}
	
	//test intersection
	@Test
	public void LineIntersectionTest(){
		Line lNormale=new Line(1,1,2,2);
		Line lIntersecteNormale= new Line(0,0,4,3);
		Line lIntersectePasNormale= new Line(-2,-1,-1,0);
		Line lConfondueAvecNormale= new Line (3,3,6,6);
		assertEquals(true,lNormale.intersecte(lIntersecteNormale));
		assertEquals(false,lNormale.intersecte(lIntersectePasNormale));
		assertEquals(true,lNormale.intersecte(lConfondueAvecNormale));		
	}
	
	
}
