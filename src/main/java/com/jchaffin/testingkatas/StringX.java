package com.jchaffin.testingkatas;

public class StringX {

	public String removeXs(String str) {
		String result = "";
		for (int i = 1; i < str.length(); i++) {
			if (!(i > str.length() - 1) && (str.substring(i, i++).equals("X"))) {
				result = result + str.substring(i, i++);
			}
		}
		return result;
	}

}
