import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectanglesTest {
	
	RectangleT rValide;
	RectangleT rInvalide;
	RectangleT rNull;
	
	@Before 
	public void setUp(){
		rValide=new RectangleT(0,4,0,5);
		rInvalide= new RectangleT(4,0,0,5);
		rNull=new RectangleT(0,0,0,0);
	}
	
	@After
	public void tearDown(){
		rValide=null;
		rInvalide=null;
		rNull=null;
	}
	
	@Test
	//test constructeur
	public void RectangleTest(){
		
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
	public void AirTest(){
		assertEquals(20,rValide.aire());
		assertEquals(20,rInvalide.aire());
		assertEquals(0,rNull.aire());
	}
	
	//test perimetre rectangle
	//test overlaping 
}
