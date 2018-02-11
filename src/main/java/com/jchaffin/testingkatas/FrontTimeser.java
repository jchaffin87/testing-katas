package com.jchaffin.testingkatas;

import java.util.Collections;

public class FrontTimeser {

	// Given a string and a non-negative int n, we'll say
	// that the front of the string is the first 3 chars, or
	// whatever is there if the string is less than length 3.
	// Return n copies of the front;

	public String frontTimes(String string, int n) {
		return String.join("", Collections.nCopies(n, string));

	}

}
