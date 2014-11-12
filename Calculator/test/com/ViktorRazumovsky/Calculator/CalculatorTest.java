package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetStat() {
	}

	@Test
	public final void testAdd() {
	}

	@Test
	public final void testAddSummary() {
		calculator.addSummary();
		calculator.addResult();
		calculator.addSummary();
		calculator.addResult();
		calculator.memPlus();
		calculator.addSummary();
	}

	@Test
	public final void testAddSubtraction() {
		calculator.addSubtraction();
		calculator.addResult();
		calculator.addSubtraction();
		calculator.addResult();
		calculator.memPlus();
		calculator.addSubtraction();
	}

	@Test
	public final void testAddMultiplication() {
		calculator.addMultiplication();
		calculator.addResult();
		calculator.addMultiplication();
		calculator.addResult();
		calculator.memPlus();
		calculator.addMultiplication();
	}

	@Test
	public final void testAddDivision() {
		calculator.addDivision();
		calculator.addResult();
		calculator.addDivision();
		calculator.addResult();
		calculator.memPlus();
		calculator.addDivision();
	}

	@Test
	public final void testAddResult() {
		calculator.clear();
		calculator.addResult();
		calculator.addSummary();
		calculator.addResult();
		calculator.addResult();
	}

	@Test
	public final void testClear() {
		calculator.clear();
	}

	@Test
	public final void testMemPlus() {
		calculator.memPlus();
		calculator.memPlus();
		calculator.status = 'r';
		calculator.memPlus();
	}

	@Test
	public final void testMemClear() {
		calculator.memClear();
		calculator.memClear();
	}

}
