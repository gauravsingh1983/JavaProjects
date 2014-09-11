package com.test.newbasic;

public class A {
	
	private String name;
	
	protected Integer i= 5;
	
	public A(){}
	
	public A(int i, String name){
		
		this.i = i;
		this.name = name;
	}
	
	public A(A a)
	{
		this.i = a.i;
		this.name = a.name;
	}
	
	/**
	 * @return the i
	 */
	public int getI()
	{
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i)
	{
		this.i = i;
	}

	protected void doSomething()
	{
		System.out.println("Hello World !!!");
	}
	
	public String doSomethingNew()
	{
		return "Hello World New!!!";
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
