package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		Square test = new Square();
		int output = test.square(5);
		assertEquals(25, output);
	}
}
