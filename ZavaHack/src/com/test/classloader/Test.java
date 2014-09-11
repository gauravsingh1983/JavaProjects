package com.test.classloader;

public class Test
{

	public void doSomething()
	{
		System.out.println("hello world !!!"+ Test.class.getSimpleName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		try
		{
			Test t = (Test) Class.forName(Test.class.getName()).newInstance();
			t.doSomething();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
