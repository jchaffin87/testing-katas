package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountXXTest {

	@Test
	public void whenCountXXIsPassedXXItReturnsOne() {
		CountXXer underTest = new CountXXer();
		assertEquals(1, underTest.countXX("xx"));
	}

	@Test
	public void whenCountXXIsPassedXXXXItReturnsThree() {
		CountXXer underTest = new CountXXer();
		assertEquals(3, underTest.countXX("xxxx"));
	}

}
