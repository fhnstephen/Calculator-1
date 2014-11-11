package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorDivisionTest {
	private OperatorDivision op;
	@Before
	public void setUp() throws Exception {
		op = new OperatorDivision(1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetResult() {
		op.str = "";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "-";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = ".";
		assertEquals(0, op.getResult(), 1e-6);
		op = new OperatorDivision(2);
		op.str = "2";
		assertEquals(1, op.getResult(), 1e-6);
	}

	@Test
	public final void testToString() {
		op.toString();
	}

	@Test
	public final void testOperatorDivision() {
		op = new OperatorDivision(0);
	}

}
