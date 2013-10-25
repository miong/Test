import org.junit.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert.*;

public class IntegerStackTest {

	IntegerStack s;
	@Before
	public void setUp(){
		s= new IntegerStack();
	}
	
	@After
	public void tearDown(){
		s=null;
	}
	
//test ajout entier --> verifier taille + bon entier
	@Test
	public void testPush(){
		s.push(2);
		assertEquals(1,s.getSize());
		assertEquals(2,s.tab[s.getSize()-1]);
	}
}
