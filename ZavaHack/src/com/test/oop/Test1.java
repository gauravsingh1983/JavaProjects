package com.test.oop;

class A { int f() { return 0; } }

 

class B extends A { int f() { return 1; } }

 

class C extends B { int f() { return 2; } }

public class Test1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		A ref1 = new C();

		 

		B ref2 = (B) ref1;

		 ref2 = (B)ref1;

		System.out.println(ref2.f());

	}

}
