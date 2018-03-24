package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LastTwoTest {

	LastTwo underTest;

	@Before
	public void setUp() {
		underTest = new LastTwo();
	}

	@Test
	public void lastTwoReturnsZeroWhenPassedA() {
		assertEquals(0, underTest.lastTwo("A"));
	}

	@Test
	public void lastTwoReturnsOneWhenPassedABAB() {
		assertEquals(1, underTest.lastTwo("ABAB"));
	}
}
