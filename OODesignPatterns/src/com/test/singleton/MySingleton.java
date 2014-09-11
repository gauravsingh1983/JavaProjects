package com.test.singleton;

public class MySingleton
{
	public static final MySingleton	resource	= new MySingleton();
	
	public void doSomething() throws CloneNotSupportedException
	{
		System.out.println("Hello World !!");
	}
}
