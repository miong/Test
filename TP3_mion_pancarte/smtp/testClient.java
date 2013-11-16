/*********************************************************
 * methTestTP3
 * smtp
 * testClient.java	
 * (c)methTestTP3 on 16 nov. 2013 01:22:08
 * By ken
 * Update 16 nov. 2013 01:22:08
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
public class testClient extends TestCase{

	@Rule
	JUnit4Mockery context = new JUnit4Mockery();
	
	private final ServerInterface mockingS = context.mock(ServerInterface.class);
	private Client c;
	
	@Before
	public void setUp(){
		c = new Client();
	}
	
	@After
	public void tearDown(){
		c= null;
	}
	
	@Test
	public void test(){
		context.checking(new Expectations() {{
		}});		
	}
	
	
}
