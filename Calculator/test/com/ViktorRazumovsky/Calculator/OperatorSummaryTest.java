package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorSummaryTest {
	private OperatorSummary op;
	@Before
	public void setUp() throws Exception {
		op = new OperatorSummary(0.0);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public final void testOperatorSummary() {
		op = new OperatorSummary(0.0);
		assertNotNull(op);
		assertEquals(0, op.first, 1e-6);
	}
	
	@Test
	public final void testGetResult() {
		assertEquals(0, op.getResult(), 1e-6);
		op.str = ".";
		assertEquals(0, op.getResult(), 1e-6);
		op = new OperatorSummary(0.0);
		op.str = "-";
		assertEquals(0, op.getResult(), 1e-6);
		op.str = "-";
		op.add("1");
		assertEquals("-1", op.getStr());
		assertEquals(-1, op.getResult(), 1e-6);
	}

	@Test
	public final void testToString() {
		// TODO
		String string = op.toString();
	}

}
