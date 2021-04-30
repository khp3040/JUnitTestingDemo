package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Calculation;


public class CalculationTest {

	@Test
	public void testAdd() {
		
		
		Calculation c1 = new Calculation();
		int res1 = c1.add(100,200);
		assertEquals(300, res1);
		
	}

	@Test
	public void testSub() {
		
		Calculation c2 = new Calculation();
		int res2 = c2.sub(700, 90);
		assertEquals(610, res2);
	}
	
	@Test
	public void testMult() {
		Calculation c3 = new Calculation();
		int res3 = c3.mult(23, 47);
		assertEquals(1081, res3);
	}
	
}
