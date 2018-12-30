package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class countATest {
	@Test
	public void test() {
		Square test = new Square();
		int output = test.countA("sharath");
		assertEquals(2, output);
	}
}
