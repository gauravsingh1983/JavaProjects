package com.test.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindATextInFile
{


	 public static int countWord(String word, File file) throws FileNotFoundException {
	 int count = 0;
	 Scanner scanner = new Scanner(file);
	 while (scanner.hasNextLine()) {
	     String nextToken = scanner.next();
	     if (nextToken.contains(word))
	     count++;
	     if(count>0)
	    	 break;
	 }
	 return count;
	 }
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		File dir = new File("c:/test/xsd");
		File[] directoryListing = dir.listFiles();
		try
		{
			if (directoryListing != null)
			{
				for (File child : directoryListing)
				{
					System.out.println("File name : "+	child.getName() + "-- "+		FindATextInFile.countWord("NetExpenseRatio", child));
				}
			}

		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
