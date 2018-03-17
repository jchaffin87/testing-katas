package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoubleXTest {

	@Test
	public void whenDoubleXIsPassedXXItReturnsTrue() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(true, underTest.doubleX("xx"));
	}

	@Test
	public void whenDoubleXIsPassedXItReturnsFalse() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(false, underTest.doubleX("x"));
	}

	@Test
	public void whenDoubleXIsPassedAItReturnsFalse() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(false, underTest.doubleX("a"));
	}

	@Test
	public void whenDoubleXIsPassedAXXItReturnsTrue() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(true, underTest.doubleX("axx"));
	}

	@Test
	public void whenDoubleXIsPassedAXAXXItReturnsFalse() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(false, underTest.doubleX("axaxx"));
	}

	@Test
	public void whenDoubleXIsPassedAXXAXXWithCapitalXesItReturnsTrue() {
		DoubleXer underTest = new DoubleXer();
		assertEquals(true, underTest.doubleX("aXXaxx"));
	}

}
