package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AltPairsTest {

	AltPairs underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new AltPairs();
	}

	@Test
	public void removePairsReturnsEmptyStringWhenPassedEmptyString() {
		assertEquals("", underTest.removePairs(""));
	}

	@Test
	public void removePairsReturnsHIWhenPassedHIGH() {
		assertEquals("HI", underTest.removePairs("HIGH"));
	}

	@Test
	public void removePairsReturnsAWhenPassedA() {
		assertEquals("A", underTest.removePairs("A"));
	}

	@Test
	public void removePairsReturnsKIENWhenPassedKITTENS() {
		assertEquals("KIEN", underTest.removePairs("KITTENS"));
	}

}
