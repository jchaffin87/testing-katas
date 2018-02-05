package com.jchaffin.testingkatas;

public class DelDel {

	public String delDel(String str) {

		if (str.length() >= 3) {
			String firstThree = str.substring(0, 3);

			if (firstThree.equals("del")) {
				return str.replace(firstThree, "");
			} else {
				return str;
			}
		}
		return str;

	}
}
