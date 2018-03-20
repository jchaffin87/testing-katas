package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {

	@Test
	public void stringBitsReturnsHWhenPassedH() {
		StringBits underTest = new StringBits();
		assertEquals("H", underTest.stringBits("H"));
	}

	@Test
	public void stringBitsReturnsHWhenPassedHi() {
		StringBits underTest = new StringBits();
		assertEquals("H", underTest.stringBits("Hi"));
	}

	@Test
	public void stringBitsReturnsACEWhenPassedABCDE() {
		StringBits underTest = new StringBits();
		assertEquals("ACE", underTest.stringBits("ABCDE"));
	}

	@Test
	public void stringBitsReturnsHLOWhenPassedHELLO() {
		StringBits underTest = new StringBits();
		assertEquals("HLO", underTest.stringBits("HELLO"));
	}

	@Test
	public void stringBitsReturnsHELLOWhenPassedHEEOLOLEO() {
		StringBits underTest = new StringBits();
		assertEquals("HELLO", underTest.stringBits("HEEOLOLEO"));
	}

}
