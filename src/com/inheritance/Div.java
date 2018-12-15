package com.inheritance;

import com.inheritance.Interface.DivI;

class Div implements DivI
{
	public int div(int a,int b)
	{
		int result  =  a/b;
		return result;
	}
}
