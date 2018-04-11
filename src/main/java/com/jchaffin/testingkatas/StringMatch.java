package com.jchaffin.testingkatas;

public class StringMatch {

	// Given 2 strings, a and b, return the number of the positions where they
	// contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	// since the "xx", "aa", and "az" substrings appear in the same place in both
	// strings.

	public int stringMatch(String stringA, String stringB) {
		int matches = 0;
		int smallestLength = Math.min(stringA.length(), stringB.length());

		for (int i = 0; i < smallestLength - 1; i++) {
			String subOfA = stringA.substring(i, i + 2);
			String subOfB = stringB.substring(i, i + 2);
			if (subOfA.equals(subOfB)) {
				matches++;
			}
		}
		return matches;
	}

}
