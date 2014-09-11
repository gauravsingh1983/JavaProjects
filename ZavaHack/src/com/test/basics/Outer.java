package com.test.basics;

public class Outer
{

	public static class Inner
	{
		public static void doSomething()
		{
			System.out.println("Hello World!!");
		}
	}
	
	public static void main(String[] args)
	{
		//Outer outer = new Outer();
		Outer.Inner.doSomething();
	}
}
