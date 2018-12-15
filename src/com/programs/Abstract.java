package com.programs;

//Abstract class can extend only one class or one abstract class at a time
//Abstract class can have both abstract and concrete methods
abstract class Example1{
	public void display1(){
		System.out.println("display1 method");
	}
}
abstract class Example2{
	public void display2(){
		System.out.println("display2 method");
	}
}
abstract class Example3 extends Example1{
	abstract void display3();
}
class Example4 extends Example3{
	public void display3(){
		System.out.println("display3 method");
	}
}
class Abstract {
	public static void main(String args[]){
		Example4 obj=new Example4();
		obj.display3();
	}
}