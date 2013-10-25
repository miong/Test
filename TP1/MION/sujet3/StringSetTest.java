import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StringSetTest {
	
	StringSet s,s2 ;
	
	@Before
	public void setUp(){
		s= new StringSet();
		s.add("bonjour");
		s.add("hello");
		s2= new StringSet();
		s2.add("bonjour");
		s2.add("bonsoir");
		s2.add("ciao");
	}
	
	@After
	public void tearDown(){
			s=null;
	}
	
	//test Add
	@Test
	public void addTest(){
		assertEquals(2,s.getSize());
		assertEquals("bonjour",s.getTab()[0]);
	}
	
	//test contains
	@Test
	public void containsTest(){		
		assertEquals(true,s.contains("bonjour"));
		assertEquals(false,s.contains("bonsoir"));		
	}
	
	//test Remove
	@Test
	public void removeTest(){
		s.remove("bonjour");
		s.remove("bonsoir");
		assertEquals(false,s.contains("bonjour"));
		assertEquals(1,s.getSize());
	}
	
	//test Count
	@Test
	public void CountTest(){
		assertEquals(2,s.count());
	}
	
	//Test union
	@Test
	public void unionTest(){
		s.union(s2);
		assertEquals(true,s.contains("bonsoir"));
		assertEquals(true,s.contains("ciao"));
		assertEquals(false,s2.contains("hello"));
	}
	
	//test intersection
	@Test
	public void intersectionTest(){
		s.intersection(s2);
		assertEquals(true,s.contains("bonjour"));
		assertEquals(false,s.contains("hello"));
		assertEquals(false,s.contains("ciao"));
		assertEquals(false,s2.contains("hello"));
	}
	
	//test clearing
	@Test
	public void clearTest(){
		s.clear();
		assertEquals(0,s.count());
		assertEquals(false,s.contains("bonjour"));
		assertEquals(false,s.contains("hello"));
	}
	
	//test enumerating
	@Test
	public void enumerate(){
		String rep = s.enumerate();
		assertEquals("bonjour hello",rep);
	}
}	