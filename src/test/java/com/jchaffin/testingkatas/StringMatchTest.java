package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringMatchTest {

	StringMatch underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new StringMatch();
	}

	@Test
	public void stringMatchReturnsOneWhenPassedHeAndHe() {
		assertEquals(1, underTest.stringMatch("he", "he"));
	}

	@Test
	public void stringMatchReturnsTwoWhenPassedHeHeAndHeHe() {
		assertEquals(3, underTest.stringMatch("hehe", "hehe"));
	}

	@Test
	public void stringMatchReturnsThreeWhenPassedXXCAAZZAndXXBAAZ() {
		assertEquals(3, underTest.stringMatch("XXCAAZZ", "XXBAAZ"));
	}

	@Test
	public void stringMatchReturnsThreeWhenPassedXXBAAZAndXXCAAZZ() {
		assertEquals(3, underTest.stringMatch("XXBAAZ", "XXCAAZZ"));
	}

}
