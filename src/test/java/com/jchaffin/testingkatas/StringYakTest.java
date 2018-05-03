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
		assertEquals("X", underTest.removeYak("X"));
	}

}
