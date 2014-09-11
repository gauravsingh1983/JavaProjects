package hacker;

import java.util.Scanner;

public class Function
{
	String FirstReverse(String str)
	{

		// System.out.println(str);
		char s = 0;
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--)
		{
			s = str.charAt(i);
			// System.out.println(s);
			str1 = str1.concat(Character.toString(s));
		}

		return str1;

	}

	public static void main(String[] args)
	{
		// keep this function call here
		Scanner s = new Scanner(System.in);
		Function c = new Function();
		System.out.print(c.FirstReverse(s.nextLine()));
	}

}