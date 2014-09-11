package com.test.basics;

public class A
{

	int i=0;
	private A(){i=8;}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int i=0;
		A h = new A();
		while(h.i<=10)h.doIt();
	}
	
	@Deprecated
	public static int doIt()
	{
		return 0;//Math.PI
	}

}
