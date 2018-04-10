package com.jchaffin.testingkatas;

public class StringMatch {

	// Given 2 strings, a and b, return the number of the positions where they
	// contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	// since the "xx", "aa", and "az" substrings appear in the same place in both
	// strings.

	public int stringMatch(String stringA, String stringB) {
		int matches = 0;
		String subOfA = "";
		String subOfB = "";
		for (int i = 0; i <= stringA.length() - 1; i++) {
			subOfA = stringA.substring(i, i++);
			if (subOfA.equals(subOfB) && stringA.length() <= stringB.length()) {
				matches++;
			}
		}
		for (int i = 0; i <= stringB.length() - 1; i++) {
			subOfB = stringB.substring(i, i++);
			if (subOfA.equals(subOfB) && stringA.length() > stringB.length()) {
				matches++;
			}
		}
		return matches;
	}

}
