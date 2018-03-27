package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayCountNinesTest {

	ArrayCountNines underTest;

	@Before
	public void setUp() {
		underTest = new ArrayCountNines();
	}

	@Test
	public void ArrayCountNinesReturnsOneWhenPassedAnArrayContaining9() {
		int[] nums = { 9 };
		assertEquals(1, underTest.arrayCountNines(nums));
	}

	@Test
	public void ArrayCountNinesReturnsOneWhenPassedAnArrayContaining99and1() {
		int[] nums = { 9, 9, 1 };
		assertEquals(2, underTest.arrayCountNines(nums));
	}

}
