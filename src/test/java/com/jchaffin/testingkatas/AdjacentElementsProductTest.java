package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {

	AdjacentElementsProduct underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new AdjacentElementsProduct();
	}

	@Test
	public void findMaxAdjacentElementsProductReturnsFourWhenPassedAnArrayContainingTwoAndTwo() {
		int[] inputArray = { 2, 2 };
		assertEquals(4, underTest.findMaxAdjacentElementsProduct(inputArray));
	}

	@Test
	public void findMaxAdjacentElementsProductReturnsSixWhenPassedAnArrayContainingThreeAndTwo() {
		int[] inputArray = { 3, 2 };
		assertEquals(6, underTest.findMaxAdjacentElementsProduct(inputArray));
	}

	@Test
	public void findMaxAdjacentElementsProductReturnsEightWhenPassedAnArrayContainingFourTwoAndEight() {
		int[] inputArray = { 4, 2, 8 };
		assertEquals(16, underTest.findMaxAdjacentElementsProduct(inputArray));
	}

	@Test
	public void findMaxAdjacentElementsProductReturnsNegativeTwelveWhenPassedAnArrayContainingNegTwentyThreeFourNegThreeEightAndNegTwelve() {
		int[] inputArray = { -23, 4, -3, 8, -12 };
		assertEquals(-12, underTest.findMaxAdjacentElementsProduct(inputArray));
	}

}
