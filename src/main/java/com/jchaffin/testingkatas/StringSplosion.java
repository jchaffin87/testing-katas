package com.jchaffin.testingkatas;

public class StringSplosion {

	// Given a non-empty string like "Code" return a string like "CCoCodCode".

	// Repeat first letter, then first and second, then first second and third, and
	// so on until you reach the second from last, then repeat the string.

	public String stringSplosion(String startingString) {
		String newString = startingString.substring(0, 1);
		if (startingString.length() > 1) {
			return newString + startingString;
		} else {
			return startingString;
		}
	}

}
