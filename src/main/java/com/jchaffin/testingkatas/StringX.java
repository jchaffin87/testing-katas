package com.jchaffin.testingkatas;

public class StringX {

	public String removeXs(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("X"))) {
				result = result + str.substring(i, i + 1);
			}
		}
		return result;
	}

}
