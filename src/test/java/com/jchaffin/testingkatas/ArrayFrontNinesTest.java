package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayFrontNinesTest {

	ArrayFrontNines underTest;

	@Before
	public void setUp() {
		underTest = new ArrayFrontNines();
	}

	@Test
	public void arrayFrontNinesReturnsTrueWhenPassedAnArrayContainingOneOneOneAndNine() {
		int[] nums = { 1, 1, 1, 9 };
		assertEquals(true, underTest.arrayFrontNines(nums));
	}

	@Test
	public void arrayFrontNinesReturnsFalseWhenPassedAnArrayContainingOneOneOneAndOne() {
		int[] nums = { 1, 1, 1, 1 };
		assertEquals(false, underTest.arrayFrontNines(nums));
	}

}
