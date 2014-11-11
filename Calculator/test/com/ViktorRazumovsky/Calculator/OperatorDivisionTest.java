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
		op.getResult();
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
