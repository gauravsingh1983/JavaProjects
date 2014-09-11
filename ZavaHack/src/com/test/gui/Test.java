package com.test.gui;

import java.util.concurrent.TimeUnit;

public class Test
{

	public static int getCPM(long timeInMilis, int numOfChars)
	{
		int cpm;
		
		if(TimeUnit.MILLISECONDS.toMinutes(timeInMilis)==0)
			return numOfChars;
		else
			cpm =  (int) (numOfChars / TimeUnit.MILLISECONDS.toMinutes(timeInMilis));
		return cpm;
	}
	
	public static void main(String[] args)
	{
		System.out.println(getCPM(120000, 150));

	}

}
