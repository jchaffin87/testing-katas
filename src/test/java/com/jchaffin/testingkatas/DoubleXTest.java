package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoubleXTest {

	@Test
	public void whenDoubleXIsPassedXXItReturnsTrue() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(true, underTest.doubleX("xx"));
	}

}
