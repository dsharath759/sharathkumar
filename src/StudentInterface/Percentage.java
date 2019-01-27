package StudentInterface;

import StudentInterface.StuInterface.PerI;

public class Percentage implements PerI{

	public double per(int a,int b,int c)
	{
		double result  =  (a+b+c)*100/300;
		return result;
	}
	
}