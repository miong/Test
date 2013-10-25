import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringSetTest extends TestCase{
	
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
	
	@Test
	public void testAdd(){
		assertEquals(2,s.getSize());
		assertEquals("bonjour",s.getTab()[0]);
	}
	
	//test contains
	@Test
	public void testContains(){		
		assertEquals(true,s.contains("bonjour"));
		assertEquals(false,s.contains("bonsoir"));		
	}
	
	//test Remove
	@Test
	public void testRemove(){
		s.remove("bonjour");
		s.remove("bonsoir");
		assertEquals(false,s.contains("bonjour"));
		assertEquals(1,s.getSize());
	}
	
	//test Count
	@Test
	public void testCount(){
		assertEquals(2,s.count());
	}
	
	//Test union
	@Test
	public void testUnion(){
		s.union(s2);
		assertEquals(true,s.contains("bonsoir"));
		assertEquals(true,s.contains("ciao"));
		assertEquals(false,s2.contains("hello"));
	}
	
	//test intersection
	@Test
	public void testIntersection(){
		s.intersection(s2);
		assertEquals(true,s.contains("bonjour"));
		assertEquals(false,s.contains("hello"));
		assertEquals(false,s.contains("ciao"));
		assertEquals(false,s2.contains("hello"));
	}
	
	//test clearing
	@Test
	public void testClear(){
		s.clear();
		assertEquals(0,s.count());
		assertEquals(false,s.contains("bonjour"));
		assertEquals(false,s.contains("hello"));
	}
	
	//test enumerating
	@Test
	public void testEnumerate(){
		String rep = s.enumerate();
		assertEquals("bonjour hello",rep);
	}
}	
