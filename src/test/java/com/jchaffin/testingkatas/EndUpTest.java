package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EndUpTest {

	EndUpper underTest;

	@Before
	public void setUp() {
		underTest = new EndUpper();
	}

	@Test
	public void whenEndUpIsPassedLowerCaseAItReturnsUpperCaseA() {
		assertEquals("A", underTest.endUp("a"));
	}

	@Test
	public void whenEnUpIsPassedLowerCaseBItReturnsUpperCaseB() {
		assertEquals("B", underTest.endUp("b"));
	}

	@Test
	public void whenEndUpIsPassedLowerCaseABCItReturnsUpperCaseABC() {
		assertEquals("ABC", underTest.endUp("abc"));
	}

	@Test
	public void whenEndUpIsPassedLowerCaseLeetItReturnsLeetWithLastThreeCharsInUpperCase() {
		assertEquals("lEET", underTest.endUp("leet"));
	}

	@Test
	public void whenEndUpIsPassedFiveAndSixCharacterWordsItReturnsThoseWordsWithTheLastThreeCharsCapitalized() {
		assertEquals("toWEL", underTest.endUp("towel"));
		assertEquals("vulCAN", underTest.endUp("vulcan"));
	}

}
