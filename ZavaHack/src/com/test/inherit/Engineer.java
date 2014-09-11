package com.test.inherit;

public class Engineer extends Employee
{

	@Override
	protected void getDetails()
	{
		System.out.println("In engineer get Details method");
	}
}
