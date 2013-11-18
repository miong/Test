
import junit.framework.TestCase;

import org.junit.Rule ;
import org.junit.After;
import org.junit.Before;
import org.junit.Test ;
import org.jmock.Expectations ;
import org.jmock.integration.junit4.JUnit4Mockery;

public class TestClient extends TestCase{

	@Rule
	JUnit4Mockery context = new JUnit4Mockery();
	
	final Strategy S = context.mock(Strategy.class);
	Client c;
	
	@Before
	public void setUp(){
		 c= new Client(Context.ALONE);
	}
	
	@After
	public void tearDown(){
		c= null;
	}
	
	@Test
	public void testGotoAirPortByCar(){
		
		context.checking(new Expectations() {{
			oneOf (S).goToAirport();
		}});
		String s =c.goToTheAirport();
		assertEquals(s,"I go to the airport by car !!");
	}
	
	public void testGotoAirPortByBus(){
		
		context.checking(new Expectations() {{
			oneOf (S).goToAirport();
		}});
		c.setC(Context.CHEAPEST);
		String s =c.goToTheAirport();
		assertEquals(s,"I go to the airport by bus !!");

	}
	
	public void testGotoAirPortByCab(){
		
		context.checking(new Expectations() {{
			oneOf (S).goToAirport();
		}});
		c.setC(Context.FASTEST);
		String s =c.goToTheAirport();
		assertEquals(s,"I go to the airport by Cab !!");

	}

	
}
