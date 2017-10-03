package assignment3.HoweverYouWannaNameIt;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {

	CalcImplementation obj;
	int a, b;
	
	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		a = 8;
		b = 4;
		
		CalcInterface intObj = mock(CalcInterface.class);
		when(intObj.add(a, b)).thenReturn(a+b);
		when(intObj.subtract(a, b)).thenReturn(a-b);   
		when(intObj.multiply(a, b)).thenReturn(a*b);
		when(intObj.divide(a, b)).thenReturn((double) (a/b));
		
		obj.setIntObj(intObj);
	}

	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}

	public void testAddTwoNums() {
		assertEquals(12, obj.addTwoNums(a, b));
	}

	public void testSubtractTwoNums() {
		assertEquals(4, obj.subtractTwoNums(a, b));
	}

	public void testMultiplyTwoNums() {
		assertEquals(32, obj.multiplyTwoNums(a, b));
	}

	public void testDivideTwoNums() {
		assertEquals(2.0, obj.divideTwoNums(a, b));
	}

}
