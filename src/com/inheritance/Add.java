package com.inheritance;

import com.inheritance.Interface.AddI;

class Add implements AddI
{
	public int add(int a,int b)
	{
		int result  =  a+b;
		return result;
	}
}
