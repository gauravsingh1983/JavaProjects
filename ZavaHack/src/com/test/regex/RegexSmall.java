package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("ba"); // the expression
		Matcher m = p.matcher("abaaaba"); // the source
		while (m.find())
		{
			String str = "\\d";
			System.out.println(str);
			System.out.print(m.start() + " ");
		}
	}
}