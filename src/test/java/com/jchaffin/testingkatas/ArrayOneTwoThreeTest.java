package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayOneTwoThreeTest {

	ArrayOneTwoThree underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new ArrayOneTwoThree();
	}

	@Test
	public void arrayOneTwoThreeReturnsFalseWhenPassedAnArrayContainingOne() {
		int[] nums = { 1 };
		assertEquals(false, underTest.arrayOneTwoThree(nums));
	}

	@Test
	public void arrayOneTwoThreeReturnsTrueWhenPassedAnArrayContainingOneTwoThree() {
		int[] nums = { 1, 2, 3 };
		assertEquals(true, underTest.arrayOneTwoThree(nums));
	}

	@Test
	public void arrayOneTwoThreeReturnsTrueWhenPassedAnArrayContainingOneOneTwoThree() {
		int[] nums = { 1, 1, 2, 3 };
		assertEquals(true, underTest.arrayOneTwoThree(nums));
	}

	@Test
	public void arrayOneTwoThreeReturnsTrueWhenPassedAnArrayContainingOneTwoThreeOne() {
		int[] nums = { 1, 2, 3, 1 };
		assertEquals(true, underTest.arrayOneTwoThree(nums));
	}

	@Test
	public void arrayOneTwoThreeReturnsFalseWhenPassedAnEmptyArray() {
		int[] nums = {};
		assertEquals(false, underTest.arrayOneTwoThree(nums));
	}

}
