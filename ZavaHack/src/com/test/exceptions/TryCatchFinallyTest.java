package com.test.exceptions;

public class TryCatchFinallyTest
{

	public static int doSomething()
	{
		int i=0;
		try{
		 i= 5/0;
		
		
		
		System.out.println();
		
		return i;
		}
		finally
		{
			System.out.println("Executing finally");
			return i;
		}
		
		//return i;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		TryCatchFinallyTest.doSomething();
	}

}
