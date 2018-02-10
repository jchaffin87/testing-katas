package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void whenFrontTimesIsPassedAItReturnsAAA() {
		FrontTimeser underTest = new FrontTimeser();
		assertEquals("AAA", underTest.frontTimes("A", 3));
	}

}
