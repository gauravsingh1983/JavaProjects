package com.test.basics;

class Dog
{
	public static void bark()
	{
		System.out.print("woof ");
	}
}

class Basenji extends Dog
{
	public static void bark()
	{
		System.out.print("woof woof woof");
	}
}

public class Bark
{
	public static void main(String args[])
	{
		Dog woofer = new Dog();
		Basenji nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}
}
