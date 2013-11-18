/*********************************************************
 * methTestTP3
 * smtp
 * testServer.java	
 * (c)methTestTP3 on 16 nov. 2013 01:22:18
 * By ken
 * Update 16 nov. 2013 01:22:18
*********************************************************/


import junit.framework.TestCase;

import org.jmock.Expectations;
import org.jmock.Sequence;
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
	
	private final Connexion mockingC = context.mock(Connexion.class);
	private Server s;
	final Sequence send = context.sequence("send");
	
	@Before
	public void setUp(){
		s = new Server();
	}
	
	@After
	public void tearDown(){
		s= null;
	}
	
	@Test
	public void test(){
		context.checking(new Expectations() {{
			oneOf (mockingC).read(); inSequence(send); will(returnValue("HELO Server"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("MAIL FROM: mion.ggb@gmail.com"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("RCPT TO: kenny.pancarte@gmail.com"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("DATA"));
			oneOf (mockingC).write("OK READY TO READ MAIL CONTANTS. PLEASE END WITH . ON A SIGLE LIGNE"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("Salut a tous"));
			oneOf (mockingC).read(); inSequence(send); will(returnValue("Ceci est mon serveur smtp"));
			oneOf (mockingC).read(); inSequence(send); will(returnValue("."));
			oneOf (mockingC).write("OK MAIL SENT"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("QUIT"));
			oneOf (mockingC).close();inSequence(send);
			
		}});
		s.client = mockingC;
		s.start();
		assertEquals(0,s.step);
		context.assertIsSatisfied();
	}
	
	@Test
	public void testQuit(){
		context.checking(new Expectations() {{
			oneOf (mockingC).read(); inSequence(send); will(returnValue("HELO Server"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("MAIL FROM: mion.ggb@gmail.com"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("QUIT"));
			oneOf (mockingC).close();inSequence(send);
			
		}});
		s.client = mockingC;
		s.start();
		assertEquals(0,s.step);
		context.assertIsSatisfied();
	}
	
	@Test
	public void testAvecErreur(){
		context.checking(new Expectations() {{
			oneOf (mockingC).read(); inSequence(send); will(returnValue("Bonjour"));
			oneOf (mockingC).write("Error: HELO missing"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("HELO Server"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("??"));
			oneOf (mockingC).write("Error: MAIL FROM missing"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("MAIL FROM: mion.ggb@gmail.com"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("??"));
			oneOf (mockingC).write("Error: RCPT TO missing"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("RCPT TO: kenny.pancarte@gmail.com"));
			oneOf (mockingC).write("OK"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("??"));
			oneOf (mockingC).write("Error: DATA missing"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("DATA"));
			oneOf (mockingC).write("OK READY TO READ MAIL CONTANTS. PLEASE END WITH . ON A SIGLE LIGNE"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("Salut a tous"));
			oneOf (mockingC).read(); inSequence(send); will(returnValue("Ceci est mon serveur smtp"));
			oneOf (mockingC).read(); inSequence(send); will(returnValue("."));
			oneOf (mockingC).write("OK MAIL SENT"); inSequence(send);
			oneOf (mockingC).read(); inSequence(send); will(returnValue("QUIT"));
			oneOf (mockingC).close();inSequence(send);
			
		}});
		s.client = mockingC;
		s.start();
		assertEquals(0,s.step);
		context.assertIsSatisfied();
	}
}
