package StudentInterface;



import java.util.Scanner;

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
		double percentage = MI.per(m1, m2, m3);
		if(percentage>=35) {
			System.out.println("Grade E(Failed)");
		}
		else if(percentage<=36 && percentage>=50) {
			System.out.println("Grade D(Passed)");
		}
		else if(percentage<=51 && percentage>=60) {
			System.out.println("Grade C(Passed)");
		}
		else if(percentage<=61 && percentage>=70) {
			System.out.println("Grade B(Passed)");
		}
		else if(percentage<=71 && percentage>=80) {
			System.out.println("Grade A(Passed with First Class Marks)");
		}
		else if(percentage<=81 && percentage>=100) {
			System.out.println("Grade A+(Passed with Distinction Marks)");
		}
	}
}
