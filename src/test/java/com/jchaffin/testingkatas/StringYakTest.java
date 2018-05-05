package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringYakTest {

	StringYak underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new StringYak();
	}

	@Test
	public void removeYakReturnsXWhenPassedX() {
		assertEquals("x", underTest.removeYak("x"));
	}

	@Test
	public void removeYakReturnsXWhenPassedXYAK() {
		assertEquals("x", underTest.removeYak("xyak"));
	}

	@Test
	public void removeYakReturnsXWhenPassedXYBK() {
		assertEquals("x", underTest.removeYak("xybk"));
	}

	@Test
	public void removeYakReturnsEmptyStringWhenPassedEmptyString() {
		assertEquals("", underTest.removeYak(""));
	}

}
