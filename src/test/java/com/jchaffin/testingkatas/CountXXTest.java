package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CountXXTest {

	CountXXer underTest;

	@Before
	public void setUp() {
		underTest = new CountXXer();
	}

	@Test
	public void whenCountXXIsPassedXXItReturnsOne() {
		assertEquals(1, underTest.countXX("xx"));
	}

	@Test
	public void whenCountXXIsPassedXXXXItReturnsThree() {
		assertEquals(3, underTest.countXX("xxxx"));
	}

	@Test
	public void whenCountXXIsPassedXxABCDItReturnsOne() {
		assertEquals(1, underTest.countXX("XxABCD"));
	}

}
