

import junit.framework.TestCase;

import org.junit.Rule ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test ;
import org.jmock.Expectations ;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnit4Mockery;


public class TestClient extends TestCase{

	@Rule
	JUnit4Mockery context = new JUnit4Mockery();
	
	final GuardianInterface G = context.mock(GuardianInterface.class);
	final VersionManagerInterface V = context.mock(VersionManagerInterface.class);
	final Sequence saveAndRestore = context.sequence("saveAndRestore");
	final Sequence save = context.sequence("save");
	int x = 10;
	int y = 12;
	int ID;
	Client c;
	final Position pos = new Position(x,y);
	final Memento testMemento = new Memento(pos);
	
	@Before
	public void setUp(){
		c = new Client(G,V,x,y);
	}
	
	@After
	public void tearDown(){
		c= null;
	}
	
	@Test
	public void testSave(){
		
		context.checking(new Expectations() {{
			
			oneOf (V).setState(with(c.p)); inSequence(save);
			oneOf (V).saveInMemento();  inSequence(save); will(returnValue(testMemento));
			oneOf (G).addMemento(testMemento);  inSequence(save);
			
		}});
		
		ID = c.save();
	}
	
public void testSaveAndRestore(){
		
		context.checking(new Expectations() {{
			
			oneOf (V).setState(with(c.p)); inSequence(saveAndRestore);
			oneOf (V).saveInMemento();  inSequence(saveAndRestore); will(returnValue(testMemento));
			oneOf (G).addMemento(testMemento);  inSequence(saveAndRestore);
			oneOf (G).getMemento(ID); inSequence(saveAndRestore); will(returnValue(testMemento));
			oneOf (V).restoreFromMemento(testMemento); inSequence(saveAndRestore);
			oneOf (V).getState(); inSequence(saveAndRestore); will(returnValue(pos));
		}});
		
		ID = c.save();
		c.p = new Position(0,0);
		assertNotSame(pos,c.p);
		c.restore(ID);
		assertSame(pos,c.p);
	}
	
	
	

}
