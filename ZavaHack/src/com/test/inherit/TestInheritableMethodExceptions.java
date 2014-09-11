package com.test.inherit;

class A
{
	public void doSomething() throws RuntimeException
	{
		System.out.println("test exceptions");
	}
}

class B extends A
{
	@Override
	public void doSomething() throws RuntimeException
	{
		// TODO Auto-generated method stub
		super.doSomething();
	}
}

public class TestInheritableMethodExceptions
{

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		B b = new B();
		b.doSomething();

	}

}
