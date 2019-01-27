package com.programs;

public class IsAssignable {


	public static void main(String[] args)
	{
		IsAssignable nm = new IsAssignable();
		nm.doit();
	}
	/*X.class.isAssignableFrom(Y.class)
     If X and Y are the same class, or X is Y's super class or super interface, return true, otherwise, false.

	X.class.isInstance(y)
	Say y is an instance of class Y, if X and Y are the same class, or X is Y's super class or super interface, return true, otherwise, false.*/
	public void doit()
	{
		A myA = new A();
		B myB = new B();
		A[] aArr = new A[0];
		B[] bArr = new B[0];

		System.out.println("b instanceof a: " + (myB instanceof A));
		System.out.println("b isInstance a: " + A.class.isInstance(myB));
		System.out.println("a isInstance b: " + B.class.isInstance(myA));
		System.out.println("b isAssignableFrom a: " + A.class.isAssignableFrom(B.class));
		System.out.println("a isAssignableFrom b: " + B.class.isAssignableFrom(A.class));
		System.out.println("bArr isInstance A: " + A.class.isInstance(bArr));
		System.out.println("bArr isInstance aArr: " + aArr.getClass().isInstance(bArr));
		System.out.println("bArr isAssignableFrom aArr: " + aArr.getClass().isAssignableFrom(bArr.getClass()));
	}

	class A
	{
	}

	class B extends A
	{
	}
}
