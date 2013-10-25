package PanMio;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StringSetTest {
	
	StringSet s ;
	
	@Before
	public void setUp(){
		s= new StringSet();
		s.add("bonjour");
	}
	
	@After
	public void tearDown(){
			s=null;
	}
	//test Remove
	//test Count
	//Test union
	//test intersection
	//test clearing
	//test enumerating
	
	
	//test Add
	@Test
	public void addTest(){
		assertEquals(1,s.getSize());
		assertEquals("bonjour",s.getTab()[0]);
	}
	
	//test contains
	@Test
	public void containsTest(){		
		assertEquals(true,s.contains("bonjour"));
		assertEquals(false,s.contains("bonsoir"));		
	}
	
}	