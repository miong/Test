/*********************************************************
 * methTestTP3
 * smtp
 * testServer.java	
 * (c)methTestTP3 on 16 nov. 2013 01:22:18
 * By ken
 * Update 16 nov. 2013 01:22:18
*********************************************************/
package smtp;

import junit.framework.TestCase;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author ken
 *
 */
public class testServer extends TestCase{

	@Rule
	JUnit4Mockery context = new JUnit4Mockery();
	
	private final ClientInterface mockingC = context.mock(ClientInterface.class);
	private Server s;
	
	@Before
	public void setUp(){
		s = new Server(8081);
	}
	
	@After
	public void tearDown(){
		s= null;
	}
	
	@Test
	public void test(){
		context.checking(new Expectations() {{
		}});		
	}
	
	

}
