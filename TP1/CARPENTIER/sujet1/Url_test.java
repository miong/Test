import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.textui.*;

public class Url_test extends TestCase{

	private UrlSplitter us;
	
	@Before
	public void setUp(){
		us = new UrlSplitter();
	}
	
	@After
	public void tearDown(){
		us = null;
	}
	
	@Test
	public void testProtocol() {
		us.split("http://some.thing");
		assertEquals("http",us.getProtocol());
	}
	
	@Test
	public void testWithoutProtocol() {
		us.split("some.thing/a-path");
		assertEquals("",us.getProtocol());
		assertEquals("some.thing",us.getDomain());
	}
	
	@Test
	public void testDomain(){
		us.split("ftp://a.large.site");
		assertEquals("a.large.site",us.getDomain());
	}
	
	@Test
	public void testPath(){
		us.split("http://a.site.with/a-path");
		assertEquals("a-path",us.getPath());
	}
	
	@Test
	public void testPortWithoutPath(){
		us.split("http://a.site.with:a-port/");
		assertEquals("a-port",us.getPort());
	}
	
	@Test
	public void testPortWithoutPath2(){
		us.split("http://a.site.with:a-port");
		assertEquals("a-port",us.getPort());
	}
	
}
