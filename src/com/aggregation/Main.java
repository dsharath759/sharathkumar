package com.aggregation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter city : ");
		String city1 = s.nextLine();
		System.out.println("Enter State : ");
		String state1 = s.nextLine();
		System.out.println("Enter country : ");
		String country1 = s.nextLine();
		
		System.out.println("\n**Student Details**");
		Address address1=new Address(city1,state1,country1);  
		Student e=new Student(111,"varun",address1);   
		e.display();  
	}  
} 
