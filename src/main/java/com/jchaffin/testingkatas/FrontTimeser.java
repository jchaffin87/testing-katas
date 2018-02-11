package com.jchaffin.testingkatas;

import java.util.Collections;

public class FrontTimeser {

	// Given a string and a non-negative int n, we'll say
	// that the front of the string is the first 3 chars, or
	// whatever is there if the string is less than length 3.
	// Return n copies of the front;

	public String frontTimes(String string, int n) {
		if (n > 0) {
			if (string.length() > 3) {
				String front = string.substring(0, 3);
				return String.join("", Collections.nCopies(n, front));
			}
			return String.join("", Collections.nCopies(n, string));
		}
		return "";
	}
}
