package com.ViktorRazumovsky.Calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OperatorDivisionTest.class, OperatorMultiplicationTest.class,
		OperatorSubtractionTest.class, OperatorSummaryTest.class,
		OperatorTest.class, CalculatorTest.class, AllTestsTest.class})
public class AllTests {
	static {
		new AllTests();
	}
	
	public static boolean isAvailable()
	{
		return true;
	}
}