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

}
