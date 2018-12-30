package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayCalTest {  

	@Test  
	public void testFindMax(){  
		assertEquals(4,ArrauCal.findMax(new int[]{1,3,4,2}));  
		assertEquals(-1,ArrauCal.findMax(new int[]{-12,-1,-3,-4,-2}));  
	}  
}
