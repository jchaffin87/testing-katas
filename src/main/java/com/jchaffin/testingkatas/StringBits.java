package com.jchaffin.testingkatas;

public class StringBits {

	// Given a string, return a new string made of every other char starting with
	// the first, so "Hello" yields "Hlo".

	public String stringBits(String startingString) {
		StringBuilder newString = new StringBuilder("");

		for (int i = 0; i < startingString.length(); i += 2) {
			newString.append(startingString.substring(i, i + 1));
		}
		return newString.toString();
	}

}
