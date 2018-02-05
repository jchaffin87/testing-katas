package com.jchaffin.testingkatas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DelDelTest {

	@Test
	public void assertThatDelReturnsEmptyString() {
		DelDel myDel = new DelDel();
		assertEquals("", myDel.delDel("del"));
	}

	@Test
	public void assertThatAbcReturnsAbc() {
		DelDel myDel = new DelDel();
		assertEquals("abc", myDel.delDel("abc"));
	}

	@Test
	public void assertThatDelabcReturnsAbc() {
		DelDel myDel = new DelDel();
		assertEquals("abc", myDel.delDel("delabc"));
	}

	@Test
	public void assertThatAbcdelReturnsAbcdel() {
		DelDel myDel = new DelDel();
		assertEquals("abcdel", myDel.delDel("abcdel"));
	}

	@Test
	public void assertThatAReturnsA() {
		DelDel myDel = new DelDel();
		assertEquals("a", myDel.delDel("a"));
	}

	@Test
	public void assertThatEmptyStringReturnsEmptyString() {
		DelDel myDel = new DelDel();
		assertEquals("a", myDel.delDel("a"));
	}

}
