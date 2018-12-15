package com.inheritance;

import com.inheritance.Interface.MulI;

class Mul implements MulI
{
	public int mul(int a,int b)
	{
		int result  =  a*b;
		return result;
	}
}
