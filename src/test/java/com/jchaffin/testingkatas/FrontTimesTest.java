package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

	FrontTimeser underTest;

	@Before
	public void setUp() {
		underTest = new FrontTimeser();
	}

	@Test
	public void whenFrontTimesIsPassedAnAAndAThreeItReturnsAAA() {
		assertEquals("AAA", underTest.frontTimes("A", 3));
	}

	@Test
	public void whenFrontTimesIsPassedBAndTwoItReturnsBB() {
		assertEquals("BB", underTest.frontTimes("B", 2));
	}

	@Test
	public void whenFrontTimesIsPassedABCDAndThreeItReturnsABCABCABC() {
		assertEquals("ABCABCABC", underTest.frontTimes("ABCD", 3));
	}

	@Test
	public void whenFrontTimesIsPassedAnEmptyStringAndThreeItReturnsAnEmptyString() {
		assertEquals("", underTest.frontTimes("", 3));
	}

}
