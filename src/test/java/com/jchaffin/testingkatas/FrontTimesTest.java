package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void whenFrontTimesIsPassedAnAAndAThreeItReturnsAAA() {
		FrontTimeser underTest = new FrontTimeser();
		assertEquals("AAA", underTest.frontTimes("A", 3));
	}

	@Test
	public void whenFrontTimesIsPassedBAndTwoItReturnsBB() {
		FrontTimeser underTest = new FrontTimeser();
		assertEquals("BB", underTest.frontTimes("B", 2));
	}

	@Test
	public void whenFrontTimesIsPassedABCDAndThreeItReturnsABCABCABC() {
		FrontTimeser underTest = new FrontTimeser();
		assertEquals("ABCABCABC", underTest.frontTimes("ABCD", 3));
	}

}
