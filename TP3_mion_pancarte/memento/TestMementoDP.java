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


public class TestMementoDP extends TestCase{

	@Rule
	JUnit4Mockery context = new JUnit4Mockery();
	
	private final GuardianInterface mockingG = context.mock(GuardianInterface.class);
	private final VersionManagerInterface mockingV = context.mock(VersionManagerInterface.class);
	private final Sequence save = context.sequence("save");
	private int x = 10;
	private int y = 12;
	private Client c;
	private final Memento testMemento = new Memento(new Position(x,y));;
	
	@Before
	public void setUp(){
		c = new Client(mockingG,mockingV,x,y);
	}
	
	@After
	public void tearDown(){
		c= null;
	}
	
	@Test
	public void testSave(){
		
		context.checking(new Expectations() {{
			oneOf (mockingV).saveInMemento(); inSequence(save);
			oneOf (mockingG).addMemento(testMemento); inSequence(save);
		}});
		
		c.save();
		context.assertIsSatisfied();
		
	}
	
	
	
	

}
