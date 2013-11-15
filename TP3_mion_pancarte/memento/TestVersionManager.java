package memento;

import static org.junit.Assert.* ;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test ;

public class TestVersionManager extends TestCase{

	int x = 10;
	int y = 12;
	int ID;
	final Position pos = new Position(x,y);
	final Memento testMemento = new Memento(pos);
	VersionManager v;
	
	@Before
	public void setUp(){
		v = new VersionManager();
	}
	
	@After
	public void tearDown(){
		v= null;
	}
	
	@Test
	public void testSaveInMemento(){
		v.setState(pos);
		Memento m = v.saveInMemento();
		assertEquals(testMemento,m);
	}
		
	@Test
	public void testRestoreFromMemento(){
		v.setState(new Position(0,0));
		v.restoreFromMemento(testMemento);
		assertEquals(testMemento.getPosition(),v.getState());
	}
		
	@Test
	public void testSetState(){
		v.setState(pos);
		assertEquals(pos,v.getState());
	}
		
	@Test
	public void testGetState(){
		v.setState(pos);
		Position a = v.getState();
		assertEquals(pos,a);
	}
}
