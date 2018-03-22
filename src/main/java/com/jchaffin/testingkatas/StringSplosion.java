package com.jchaffin.testingkatas;

public class StringSplosion {

	// Given a non-empty string like "Code" return a string like "CCoCodCode".

	// Repeat first letter, then first and second, then first second and third, and
	// so on until you reach the second from last, then repeat the string.

	public String stringSplosion(String startingString) {
		String newString = "";
		if (startingString.length() > 1) {
			for (int i = 0; i <= startingString.length(); i++) {
				newString = newString + startingString.substring(0, i);
			}
			return newString;
		} else {
			return startingString;
		}
	}

}
