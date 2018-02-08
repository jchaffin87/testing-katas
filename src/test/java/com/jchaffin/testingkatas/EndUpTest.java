package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EndUpTest {

	@Test
	public void whenEndUpIsPassedLowerCaseAItReturnsUpperCaseA() {
		EndUpper underTest = new EndUpper();
		assertEquals("A", underTest.endUp("a"));
	}

}
