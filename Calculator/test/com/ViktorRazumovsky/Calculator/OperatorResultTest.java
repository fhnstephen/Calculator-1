package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorResultTest {
	private OperatorResult op;
	private OperatorMultiplication cur;
	@Before
	public void setUp() throws Exception {
		cur = new OperatorMultiplication(1);
		op = new OperatorResult(1,cur);
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testGetResult() {
		assertEquals(0, op.getResult(), 1e-6);
	}

	@Test
	public final void testToString() {
		op.toString();
	}

	@Test
	public final void testOperatorResult() {
		
		op = new OperatorResult(0,cur);
	}

	@Test
	public final void testStep() {
		op.step();
		assertEquals(0, op.Old.first, 1e-6);
	}

}
