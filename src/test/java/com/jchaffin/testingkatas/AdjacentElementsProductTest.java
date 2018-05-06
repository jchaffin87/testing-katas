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

}
