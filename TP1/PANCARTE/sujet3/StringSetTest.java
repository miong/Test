package PanMio;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StringSetTest {
	
	
	//test contains
	//test Remove
	//test Count
	//Test union
	//test intersection
	//test clearing
	//test enumerating
	
	
	//test Add
	@Test
	public void addTest(){
		StringSet s = new StringSet();
		s.add("bonjour");
		assertEquals(1,s.getSize());
		assertEquals("bonjour",s.getTab()[0]);
	}
	
}	