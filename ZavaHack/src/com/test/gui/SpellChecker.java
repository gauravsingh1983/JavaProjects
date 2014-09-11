package com.test.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public class SpellChecker
{

	public static String CheckWord(String wordToCheck)
	{

		char checkCharLast = wordToCheck.charAt(wordToCheck.length() - 1);
		char checkCharFirst = wordToCheck.charAt(0);

		switch (checkCharLast)
		{
			case '.':
			case '?':
			case '!':
			case '\'':
			case '"':
			case ',':
			case ':':
			case '(':
			case ')':
			case '$':
			case '#':
			case '%':
				wordToCheck = wordToCheck.substring(0, wordToCheck.length() - 1);
				break;
			default:
				break;
		}

		switch (checkCharFirst)
		{
			case '.':
			case '?':
			case '!':
			case '\'':
			case '"':
			case ',':
			case ':':
			case '(':
			case ')':
			case '$':
			case '#':
			case '%':
				wordToCheck = wordToCheck.substring(1, wordToCheck.length());
				break;
			default:
				break;
		}

		if (wordToCheck.length() < 2)
			return null;

		for (int idx = 0; idx < wordToCheck.length(); idx++)
			if (!Character.isLetter(wordToCheck.charAt(idx)))
				return null;

		return wordToCheck.toLowerCase();
	}

	public static void buildDictionarySet(Set<String> dictionarySet, String filename) throws IOException
	{
		BufferedReader reader = null;
		String s = null;
		String validWord = null;
		try
		{
			reader = new BufferedReader(new FileReader(filename));

			while ((s = reader.readLine()) != null)
			{
				String[] dictWordArr = s.split(" ");
				for (String str : dictWordArr)
				{
					validWord = CheckWord(str);

					if (validWord != null)
						dictionarySet.add(validWord);
				}
			}

			reader.close();
		}
		catch (IOException e)
		{
			System.out.println("IOException on building dictionary set.");
			System.out.println(e);
		}
		finally
		{

			if (reader != null)
				reader.close();
		}
	}

	public static void buildWordMap(String out, List<String> wordMap, Set<String> dictionarySet) throws IOException
	{
		String currentWord = "";

		StringTokenizer st = new StringTokenizer(out.toString(), " ");

		while (st.hasMoreElements())
		{
			Integer i = null;
			currentWord = st.nextToken();

			currentWord = CheckWord(currentWord);

			if (currentWord == null)
				continue;

			if (dictionarySet.contains(currentWord))
				continue;

			wordMap.add(currentWord);

		}

	}

	public static int getCPM(long timeInMilis, int numOfChars)
	{
		int cpm;

		if (TimeUnit.MILLISECONDS.toMinutes(timeInMilis) == 0)
			return numOfChars;
		else
			cpm = (int) (numOfChars / TimeUnit.MILLISECONDS.toMinutes(timeInMilis));
		return cpm;
	}

	public static String[] evalTyping(String text, String srcFilename) throws IOException
	{

		String[] resultArr = new String[2];
		long processingStart = System.currentTimeMillis();
		Set<String> dictionarySet = new HashSet<String>();
		buildDictionarySet(dictionarySet, srcFilename);

		System.out.println(dictionarySet);

		List<String> wordMap = new ArrayList<String>();
		buildWordMap(text, wordMap, dictionarySet);

		// System.out.println(dictionarySet);

		System.out.println("\nMisspelled Words");
		System.out.println("=====================");

		System.out.println(wordMap);

		for (String s : wordMap)
		{
			System.out.println(s);
		}

		long processingEnd = System.currentTimeMillis();

		System.out.println("\nTotal time taken : " + TimeUnit.MILLISECONDS.toMinutes(processingEnd - processingStart) + " minutes");
		System.out.println("\nTyping speed in character per minute [CPM] : " + getCPM((processingEnd - processingStart), text.length()) + " !");
		System.out.println("\nNumber of misspelled words: " + wordMap.size());
		
		resultArr[0] =  String.valueOf(getCPM((processingEnd - processingStart), text.length()));
		resultArr[1] = String.valueOf( wordMap.size());
		
		return resultArr;
		
	}
}