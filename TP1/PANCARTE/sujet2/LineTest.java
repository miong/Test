package LineTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineTest {
	
	
	//test constructeur
	//test intersection
	@Test
	public void LineConstructeurTest(){
		Line lNormale=new Line(1,1,2,2);
		assertEquals(lNormale.x1,1);
		assertEquals(lNormale.y1,1);
		assertEquals(lNormale.x2,2);
		assertEquals(lNormale.y2,2);
	}
	
	
}
