package com.jchaffin.testingkatas;

public class ArrayFrontNines {

	// Given an array of ints, return true if one of the first 4 elements in the
	// array is a 9. The array length may be less than 4.

	public boolean arrayFrontNines(int[] nums) {
		boolean firstFourHasANine = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				firstFourHasANine = true;
				break;
			}
		}
		return firstFourHasANine;
	}

}
