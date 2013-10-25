import static org.junit.Assert.*;
import org.junit.Test;

public class RectanglesTest {
	@Before
	public void setUp(){
		
	}
	
	@After
	
	public void tearDown(){
		
	}
	
	
	@Test
	//test constructeur
	public void RectangleTest(){
		RectangleT rValide=new RectangleT(0,4,0,5);
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
	
	//test perimetre rectangle
	//test overlaping 
}
