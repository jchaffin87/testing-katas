package com.jchaffin.testingkatas;

public class LastTwo {

	// Given a string, return the count of the number of times that a substring
	// length 2 appears in the string and also as the last 2 chars of the string, so
	// "hixxxhi" yields 1 (we won't count the end substring).

	// make a string of the last two chars and count how many times that string
	// appears in str.

	public int lastTwo(String str) {
		if (str.length() < 2) {
			return 0;
		} else {
			String lastTwoLetters = str.substring(str.length() - 2);
			int count = 0;
			for (int i = 0; i < str.length() - 2; i++) {
				String check = str.substring(i, i + 2);
				if (check.equals(lastTwoLetters)) {
					count++;
				}
			}
			return count;
		}
	}
}
