package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorEmptyTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetResult() {
		OperatorEmpty op = new OperatorEmpty(0);
		op.getResult();
		op.str = "-";
		op.getResult();
		op.str = ".";
		op.getResult();
		op.str = "1";
		op.getResult();
	}

}
