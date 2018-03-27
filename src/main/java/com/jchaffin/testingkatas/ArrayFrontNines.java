package com.jchaffin.testingkatas;

public class ArrayFrontNines {

	public boolean arrayFrontNines(int[] nums) {
		boolean firstFourHasANine = false;
		for (int i = 0; i < 4; i++) {
			if (nums[i] == 9) {
				firstFourHasANine = true;
				break;
			}
		}
		return firstFourHasANine;
	}

}
