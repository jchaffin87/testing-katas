package com.jchaffin.testingkatas;

public class CountXXer {

	// Count the number of "xx" in the given string. We'll say that overlapping is
	// allowed, so "xxx" contains 2 "xx".

	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals("x") && str.substring(i + 1, i + 2).equals("x")) {
				count++;
			}
		}
		return count;
	}

}
