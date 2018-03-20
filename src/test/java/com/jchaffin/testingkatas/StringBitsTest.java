package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {

	@Test
	public void stringBitsReturnsHWHenPassedH() {
		StringBits underTest = new StringBits();
		assertEquals("H", underTest.stringBits("H"));
	}

	@Test
	public void stringBitsReturnsHiWHenPassedHi() {
		StringBits underTest = new StringBits();
		assertEquals("H", underTest.stringBits("Hi"));
	}

	@Test
	public void stringBitsReturnsACEWHenPassedABCDE() {
		StringBits underTest = new StringBits();
		assertEquals("ACE", underTest.stringBits("ABCDE"));
	}

}
