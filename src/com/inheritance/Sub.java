package com.inheritance;

import com.inheritance.Interface.SubI;

class Sub implements SubI
{
	public int sub(int a,int b)
	{
		int result  =  a-b;
		return result;
	}
}
