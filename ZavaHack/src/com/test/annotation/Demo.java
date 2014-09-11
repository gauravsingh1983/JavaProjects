package com.test.annotation;

public class Demo
{
	public static void main(String[] args)
	{
		TestAnnotationParser parser = new TestAnnotationParser();
		try
		{
			parser.parse(Annotated.class);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
