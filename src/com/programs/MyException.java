package com.programs;

import java.util.Scanner;

//custom exception
class MyException extends Exception
{
	// default constructor
	/*	MyException() {  		
	}*/

	// parametrized constructor
	MyException(String str) { 
		super(str); 
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try  {
			System.out.println("Enter Age : ");
			int n = s.nextInt();
			if (n < 18)
			{
				MyException me = new MyException("Invalid Age");
				throw me;
			}
			else {
				System.out.println("welcome");
			}
		} 
		catch (MyException e) {
			e.printStackTrace();
		}
	}
}
