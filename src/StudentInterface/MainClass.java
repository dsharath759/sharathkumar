package StudentInterface;



import java.util.Scanner;

import com.inheritance.MultipleInheritance;

import StudentInterface.StuInterface.PerI;
import StudentInterface.StuInterface.TotalMar;

public class MainClass implements TotalMar,PerI{
	public double calculate_total(int a,int b,int c)
	{
		Total A  =  new Total();
		return A.calculate_total(a, b, c);
	}
	public double per(int a,int b,int c)
	{
		Percentage B  =  new Percentage();
		return B.per(a, b, c);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		MainClass MI  =  new MainClass();
		System.out.println("Enter Your Name : ");
		String name = s.nextLine();
		System.out.println("Enter Roll Number : ");
		int rollno = s.nextInt();
		System.out.println("Enter Maths Marks : ");
		int m1 = s.nextInt();
		System.out.println("Enter Physics Marks   : ");
		int m2 = s.nextInt();
		System.out.println("Enter Chemistry Marks : ");
		int m3 = s.nextInt();
		System.out.println("\n\t***Student Marks***");
		System.out.println("Name        : "+name);
		System.out.println("Roll Number : "+rollno);
		System.out.println("\nMaths      : "+m1);
		System.out.println("Physicss   : "+m2);
		System.out.println("Chemistry  : "+m3);
		System.out.println("\nTotal Marks   : "+MI.calculate_total(m1, m2, m3));
		System.out.println("Percentage    : "+MI.per(m1, m2, m3));
		
}
}
