package com.jchaffin.testingkatas;

public class AltPairs {

	// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	// ... so "kittens" yields "kien".

	public String removePairs(String str) {
		String result = "";
		if (!str.isEmpty() && str.length() >= 2) {
			for (int i = 0; i <= str.length(); i += 4) {
				int end = i + 2;
				if (end > str.length()) {
					end = str.length();
				}
				result = result + str.substring(i, end);
			}
		} else {
			result = str;
		}
		return result;
	}
}
