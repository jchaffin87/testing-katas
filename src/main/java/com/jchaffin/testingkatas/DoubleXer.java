package com.jchaffin.testingkatas;

public class DoubleXer {

	// Given a string, return true if the first instance of "x" in
	// the string is immediately followed by another "x".

	public boolean doubleX(String str) {
		int i = str.indexOf("x");
		if (i == -1) {
			return false;
		}
		String x = str.substring(i);
		return x.startsWith("xx");
	}

}
