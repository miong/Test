import static org.junit.Assert.*;

import org.junit.*;


public class IntegerStackTest {

	IntegerStack s;
	@Before
	public void setUp(){
		s= new IntegerStack();
	}
	
	@After
	public void tearDown(){
		s=null;
	}
	
	@Test
	public void testPush(){
		s.push(2);
		assertEquals(1,s.getSize());
		assertEquals(2,s.getTab()[s.getSize()-1]);
	}
	@Test
	public void testPop(){
		s.push(3);
		int size1=s.getSize();
		int a=s.pop();
		assertEquals(size1,s.getSize()+1);
		assertEquals(3,a);
	}
}
