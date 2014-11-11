package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperatorTest {
	private Operator op;

	@Before
	public void setUp() throws Exception {
		op = new OperatorSummary(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		op.add("1");
		assertEquals("1", op.str);
	}

	@Test
	public final void testZnak() {
		op.str = "";
		op.znak();
		assertEquals("", op.str);
		op.str = "-1";
		op.znak();
		assertEquals("1", op.str);
		op.str = "1";
		op.znak();
		assertEquals("-1", op.str);
	}

	@Test
	public final void testDot() {
		op.str = "";
		op.dot();
		op.str = ".";
		op.dot();
	}

	@Test
	public final void testSetFirst() {
		op.setFirst(1);
		assertEquals(1, op.first, 1e-6);
	}

	@Test
	public final void testBack() {
		op.str = "";
		op.back();
		assertEquals("", op.str);
		op.str = "123";
		op.back();
		assertEquals("12", op.str);
	}

	@Test
	public final void testGetStr() {
		op.str = "123";
		assertEquals("123", op.getStr());
	}

}
