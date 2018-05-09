package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {

	ShapeArea underTest;

	@Before
	public void setUp() throws Exception {
		underTest = new ShapeArea();
	}

	@Test
	public void findShapeAreaReturnsOneWhenPassedOne() {
		assertEquals(1, underTest.findShapeArea(1));
	}

	@Test
	public void findShapeAreaReturnsFiveWhenPassedTwo() {
		assertEquals(5, underTest.findShapeArea(2));
	}
}
