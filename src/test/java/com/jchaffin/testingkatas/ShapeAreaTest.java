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
	public void test() {
		assertEquals(1, underTest.findShapeArea(1));
	}

}
