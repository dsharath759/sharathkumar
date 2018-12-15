package com.programs;

public class Constructor1
{
	String name;
	String team;
	int age;
	Constructor1 ()   //default constructor.
	{
		name ="";
		team ="";
		age = 0;
	}
	Constructor1(String n, String t, int a)   //constructor overloaded
	{
		name = n;
		team = t;
		age = a;
	}
	Constructor1 (Constructor1 con)    
	{
		name = con.name;
		team = con.team;
		age = con.age;
	}
	public String toString()
	{
		return "this is " + name + " of "+team;
	}

	public static void main (String[] args)
	{
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1("sachin", "India", 32);
		Constructor1 c3 = new Constructor1(c2 );
		System.out.println(c2);
		System.out.println(c3);
		c1.name = "Virat";
		c1.team= "India";
		c1.age = 32;
		System.out.println(c1);

	}
}