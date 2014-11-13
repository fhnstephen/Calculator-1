package com.ViktorRazumovsky.Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StatTest {
	private Stat cur;
	@Before
	public void setUp() throws Exception {
		cur = new Stat("2",(boolean)true,(boolean)false);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testStat() {
		
		assertEquals(2, Double.parseDouble(cur.str), 1e-6);
		assertEquals((boolean)true, cur.mem);
		assertEquals((boolean)false, cur.memC);
	}

}
