package com.inheritance;

import java.util.Scanner;

import com.inheritance.Interface.AddI;
import com.inheritance.Interface.DivI;
import com.inheritance.Interface.MulI;
import com.inheritance.Interface.SubI;


public class MultipleInheritance implements AddI,SubI,MulI,DivI {
  
		public int add(int a,int b)
		{
			Add A  =  new Add();
			return A.add(a, b);
		}
		public int sub(int a,int b)
		{
			Sub S  =  new Sub();
			return S.sub(a, b);
		}
	
		public int mul(int a,int b)
		{
			Mul M  =  new Mul();
			return M.mul(a, b);
		}
	
		public int div(int a,int b)
		{
			Div D  =  new Div();
			return D.div(a, b);
		}
	
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	MultipleInheritance MI  =  new MultipleInheritance();
	System.out.println("Enter First Number : ");
	int n1 = s.nextInt();
	System.out.println("Enter Second Number : ");
	int n2 = s.nextInt();
	System.out.println("Addition : "+MI.add(n1, n2));
	System.out.println("Subtracion : "+MI.sub(n1, n2));
	System.out.println("Multiplication : "+MI.mul(n1, n2));
	System.out.println("Divison : "+MI.div(n1, n2));
}
}