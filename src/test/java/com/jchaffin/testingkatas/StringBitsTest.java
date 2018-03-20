package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringBitsTest {

	@Test
	public void stringBitsReturnsHWHenPassedH() {
		StringBits underTest = new StringBits();
		assertEquals("H", underTest.stringBits("H"));
	}

}
