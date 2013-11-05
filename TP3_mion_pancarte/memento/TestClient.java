package memento;

import static org.junit.Assert.* ;
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
	final Sequence save = context.sequence("save");
	int x = 10;
	int y = 12;
	Client c;
	final Position pos = new Position(x,y);
	final Memento testMemento = new Memento(pos);
	@Before
	public void setUp(){
		c = new Client(G,V,x,y);
		System.out.println(new Position(10,12).equals(pos));
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
		
		c.save();
	
		
	}
	
	
	
	

}
