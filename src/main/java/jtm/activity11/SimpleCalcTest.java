package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;

public class SimpleCalcTest {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		// TODO initialize SimpleCalc object
		SimpleCalc sc = new SimpleCalc();
	}

	@Test
	public void testAddInRange() {
		// TODO test addition for case where both numbers and result is in allowed range
		Integer result = SimpleCalc.add(3, 6);
		assertEquals(new Integer(9), result);
	}

	@Test
	public void testAddOutOfRange() {
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
		Integer result = SimpleCalc.add(15, 16);
		assertNull("Input value <15> is out of range [-10,10]", result);
	}

	@Test
	public void testSubtractInRange() {
		// TODO
		Integer result = SimpleCalc.subtract(3, 6);
		assertEquals(new Integer(-3), result);
	}

	@Test
	public void testSubtractOutOfRange() {
		// TODO
		Integer result = SimpleCalc.subtract(35, 66);
		assertNull("Input value <35> is out of range [-10,10]", result);
	}

	@Test
	public void testMultiplyInRange() {
		// TODO
		Integer result = SimpleCalc.multiply(3, 2);
		assertEquals(new Integer(6), result);
	}

	@Test
	public void testMultiplyOutOfRange() {
		// TODO
		Integer result = SimpleCalc.multiply(22, 33);
		assertNull("Input value <88> is out of range [-10,10]", result);
	}

	@Test
	public void testDivideInRange() {
		// TODO
		Integer result = SimpleCalc.divide(6, 2);
		assertEquals(new Integer(3), result);
	}

	@Test
	public void testDivideOutOfRange() {
		// TODO
		Integer result = SimpleCalc.divide(24, 33);
		assertNull("Input value <24> is out of range [-10,10]", result);
	}

}
