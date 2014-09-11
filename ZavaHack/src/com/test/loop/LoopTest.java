package com.test.loop;

public class LoopTest
{
	
	String[] testArr = {"gaurav", "vipin", "mulk raj","rajiv"};
	
	
	public void doSomething()
	{
		String a = null;
		
		System.out.println(testArr.length);
		
		for(String s: testArr)
		{
			a = s;
			System.out.println(a);
		}
		
		for(int i=0 ; i < 4 ; i++)
		{
			System.out.println(testArr[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		LoopTest loopTest = new LoopTest();
		loopTest.doSomething();
	}

}
