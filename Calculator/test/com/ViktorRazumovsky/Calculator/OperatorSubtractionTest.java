package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorSubtractionTest {
	private OperatorSubtraction op;
	@Before
	public void setUp() throws Exception {
		op = new OperatorSubtraction(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetResult() {
		op.str = "";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = ".";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "-";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "-";
		op.add("1");
		assertEquals("-1", op.getStr());
		assertEquals(1, op.getResult(), 1e-6);
	}

	@Test
	public final void testToString() {
		op.toString();
	}

	@Test
	public final void testOperatorSubtraction() {
		op = new OperatorSubtraction(1);
		assertEquals(1, op.getResult(), 1e-6);
	}

}
