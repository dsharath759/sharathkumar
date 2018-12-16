package StudentInterface;

import StudentInterface.StuInterface.TotalMar;

public class Total implements TotalMar{

	public double calculate_total(int a,int b,int c)
	{
		double result  =  a+b+c;
		return result;
	}
}
