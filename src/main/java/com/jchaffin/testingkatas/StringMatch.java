package com.jchaffin.testingkatas;

public class StringMatch {

	// Given 2 strings, a and b, return the number of the positions where they
	// contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	// since the "xx", "aa", and "az" substrings appear in the same place in both
	// strings.

	public int stringMatch(String stringA, String stringB) {
		int matches = 0;
		for (int i = 0; i <= stringA.length() - 1; i++) {
			String subOfA = stringA.substring(i, i++);
			String subOfB = stringB.substring(i, i++);
			if (subOfA.equals(subOfB)) {
				matches++;
			}
		}

		return matches;
	}

}
