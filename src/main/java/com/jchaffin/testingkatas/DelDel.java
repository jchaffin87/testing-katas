package com.jchaffin.testingkatas;

public class DelDel {

	// Given a string, if the string "del" appears starting at index 0,
	// return a string where that "del" has been deleted.
	// Otherwise, return the string unchanged.
	//
	//
	// delDel("adelbc") --> "abc"
	// delDel("adelHello") --> "aHello"
	// delDel("adedbc") -->"adedbc"

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
