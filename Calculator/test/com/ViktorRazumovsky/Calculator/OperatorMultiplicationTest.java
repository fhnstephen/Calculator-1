package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorMultiplicationTest {
	private OperatorMultiplication op;
	@Before
	public void setUp() throws Exception {
		op = new OperatorMultiplication(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetResult() {
		assertEquals(0, op.getResult(), 1e-6);
		op.str = ".";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "-";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "1";
		assertEquals(1, op.getResult(), 1e-6);
	}

	@Test
	public final void testToString() {
		op.toString();
	}

	@Test
	public final void testOperatorMultiplication() {
		op = new OperatorMultiplication(0);
	}

}
