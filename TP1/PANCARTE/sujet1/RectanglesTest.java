import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectanglesTest extends TestCase{
	
	RectangleT rValide;
	RectangleT rInvalide;
	RectangleT rNull;
	RectangleT rPlat;
	
	@Before 
	public void setUp(){
		rValide=new RectangleT(0,4,0,5);
		rInvalide= new RectangleT(4,0,0,5);
		rNull=new RectangleT(0,0,0,0);
		rPlat=new RectangleT(0,0,0,5);
	}
	
	@After
	public void tearDown(){
		rValide=null;
		rInvalide=null;
		rNull=null;
		rPlat=null;
	}
	
	@Test
	//test constructeur
	public void testRectangle(){
		
		assertEquals(rValide.xmin,0);
		assertEquals(rValide.xmax,4);
		assertEquals(rValide.ymin,0);
		assertEquals(rValide.ymax,5);
		
		RectangleT rInvalide= new RectangleT(4,0,0,5);
		assertEquals(rInvalide.xmin,0);
		assertEquals(rInvalide.xmax,4);
		assertEquals(rInvalide.ymin,0);
		assertEquals(rInvalide.ymax,5);
	}
	
	
	//test aire rectangle
	@Test
	public void testAir(){
		assertEquals(20,rValide.aire());
		assertEquals(20,rInvalide.aire());
		assertEquals(0,rNull.aire());
	}
	
	//test perimetre rectangle
	@Test
	public void testPerimetre(){
		assertEquals(18,rValide.perimetre());
		assertEquals(18,rInvalide.perimetre());
		assertEquals(0,rNull.perimetre());
		assertEquals(10,rPlat.perimetre());
	}
	//test overlaping 
	@Test
	public void testOverlaping(){
		assertEquals(true,rValide.overlap(rInvalide));
		RectangleT overTest= new RectangleT(6,10,6,9);
		assertEquals(false,rValide.overlap(overTest));
	}
}
