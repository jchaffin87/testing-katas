package com.jchaffin.testingkatas;

public class AltPairs {

	// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	// ... so "kittens" yields "kien".

	public String removePairs(String str) {
		String result = "";
		if (!str.isEmpty() && str.length() >= 2) {
			for (int i = 0; i <= str.length() - 3; i = i + 3) {
				result = result + str.substring(i, i + 2);
			}
		} else {
			result = str;
		}
		return result;
	}
}
