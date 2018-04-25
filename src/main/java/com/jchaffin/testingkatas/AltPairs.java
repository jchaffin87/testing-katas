package com.jchaffin.testingkatas;

public class AltPairs {

	// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	// ... so "kittens" yields "kien".

	public String removePairs(String str) {
		if (!str.isEmpty() && str.length() >= 2) {
			return str.substring(0, 2);
		} else {
			return str;
		}
	}
}
