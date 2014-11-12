/**
 * 
 */
package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zhyk
 *
 */
public class CalculatorTest {

	private Calculator calculator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#getStat()}.
	 */
	@Test
	public final void testGetStat() {
		assertEquals("", calculator.getStat().str);
		calculator.add('+');
		calculator.add('=');
		assertEquals("0.0", calculator.getStat().str);
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#add(char)}.
	 */
	@Test
	public final void testAdd() 
	{
		calculator.add('m');
		calculator.add('s');
		for (char i = '0'; i <= '9'; i++) {
			calculator.add('.');
			calculator.add(i);
			calculator.add('+');
			calculator.add('=');
			calculator.add(i);
		}
		calculator.add('z');
		calculator.add('-');
		calculator.add('=');
		calculator.add('z');
		calculator.add('*');
		calculator.add('/');
		calculator.add('c');
		calculator.add('b');
		calculator.memPlus();
		calculator.add('m');
		calculator.add('s');
		calculator.memPlus();
		calculator.add('-');
		calculator.add('=');
		calculator.add('z');
		calculator.add('0');
		calculator.add('+');
		calculator.add('m');
		calculator.add('=');
		calculator.add('.');
		for (char i = '0'; i <= '9'; i++) {
			calculator.add(i);
		}
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#addSummary()}.
	 */
	@Test
	public final void testAddSummary() {
		calculator.addSummary();
		calculator.addResult();
		calculator.addSummary();
		calculator.addResult();
		calculator.memPlus();
		calculator.addSummary();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#addSubtraction()}.
	 */
	@Test
	public final void testAddSubtraction() {
		calculator.addSubtraction();
		calculator.addResult();
		calculator.addSubtraction();
		calculator.addResult();
		calculator.memPlus();
		calculator.addSubtraction();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#addMultiplication()}.
	 */
	@Test
	public final void testAddMultiplication() {
		calculator.addMultiplication();
		calculator.addResult();
		calculator.addMultiplication();
		calculator.addResult();
		calculator.memPlus();
		calculator.addMultiplication();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#addDivision()}.
	 */
	@Test
	public final void testAddDivision() {
		calculator.addDivision();
		calculator.addResult();
		calculator.addDivision();
		calculator.addResult();
		calculator.memPlus();
		calculator.addDivision();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#addResult()}.
	 */
	@Test
	public final void testAddResult() {
		calculator.clear();
		calculator.addResult();
		calculator.addSummary();
		calculator.addResult();
		calculator.addResult();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#clear()}.
	 */
	@Test
	public final void testClear() {
		calculator.clear();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#memPlus()}.
	 */
	@Test
	public final void testMemPlus() {
		calculator.memPlus();
		calculator.memPlus();
		calculator.status = 'r';
		calculator.memPlus();
	}

	/**
	 * Test method for {@link com.ViktorRazumovsky.Calculator.Calculator#memClear()}.
	 */
	@Test
	public final void testMemClear() {
		calculator.memClear();
		calculator.memClear();
	}

}
