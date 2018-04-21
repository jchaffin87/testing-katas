package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringXTest {

	StringX underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new StringX();
	}

	@Test
	public void removeXsMethodReturnsEmptyStringWhenPassedEmptyString() {
		assertEquals("", underTest.removeXs(""));
	}

	@Test
	public void removeXsMethodReturnsXStringWhenPassedX() {
		assertEquals("X", underTest.removeXs("X"));
	}

	@Test
	public void removeXsMethodReturnsXWhenPassedXXX() {
		assertEquals("XX", underTest.removeXs("XXX"));
	}

}
