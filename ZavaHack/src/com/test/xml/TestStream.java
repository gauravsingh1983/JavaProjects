package com.test.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestStream
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//InputStream i =TestStream.class.getClassLoader().getResourceAsStream("Input.java");
		File f = new File("c:/test/f.txt");
		InputStream i = null;
		try
		{
			i = new FileInputStream(f);
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(i);
	}

}
