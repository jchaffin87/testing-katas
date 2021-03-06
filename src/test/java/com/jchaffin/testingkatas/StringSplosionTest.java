package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSplosionTest {

	@Test
	public void stringSplosionReturnsAWhenPassedA() {
		StringSplosion underTest = new StringSplosion();
		assertEquals("A", underTest.stringSplosion("A"));
	}

	@Test
	public void stringSplosionReturnsAABWhenPassedAB() {
		StringSplosion underTest = new StringSplosion();
		assertEquals("AAB", underTest.stringSplosion("AB"));
	}

	@Test
	public void stringSplosionReturnsAABABCWhenPassedABC() {
		StringSplosion underTest = new StringSplosion();
		assertEquals("AABABC", underTest.stringSplosion("ABC"));
	}

	@Test
	public void stringSplosionReturnsCCoCodCodeWhenPassedCode() {
		StringSplosion underTest = new StringSplosion();
		assertEquals("CCoCodCode", underTest.stringSplosion("Code"));
	}

	@Test
	public void stringSplosionReturnsKKiKitKittKitteKittenWhenPassedKitten() {
		StringSplosion underTest = new StringSplosion();
		assertEquals("KKiKitKittKitteKitten", underTest.stringSplosion("Kitten"));
	}

}
