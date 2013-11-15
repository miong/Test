package memento;

import static org.junit.Assert.* ;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test ;

public class TestGuardian extends TestCase{

	int x = 10;
	int y = 12;
	int ID;
	final Position pos = new Position(x,y);
	final Memento testMemento = new Memento(pos);
	Guardian g;
	
	@Before
	public void setUp(){
		g = new Guardian();
	}
	
	@After
	public void tearDown(){
		g= null;
	}
	
	@Test
	public void testAddMemento(){
		
		ID = g.addMemento(testMemento);
		assertEquals(1,g.getNumberOfSavedObject());
	}
	
	@Test
	public void testGetMemento(){
		ID = g.addMemento(testMemento);
		Memento m= g.getMemento(ID);
		assertEquals(m,testMemento);
	}
	
	@Test
	public void testGetSize(){
		g.addMemento(testMemento);
		g.addMemento(testMemento);
		assertEquals(g.getNumberOfSavedObject(),2);
	}
}
