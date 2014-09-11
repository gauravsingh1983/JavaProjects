package hacker;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class SpellChecker
{

	public static String inputString( String caption )
	{
		String str = "";
		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
		
		System.out.print( caption );
		try
		{
			str = input.readLine( );
		}
		catch ( Exception e )
		{
			e.printStackTrace( );
		}
		
		return str;
	}
	
	public static String CheckWord(String wordToCheck)
	{

		char checkCharFirst = wordToCheck.charAt(wordToCheck.length() - 1); // check
																			// the
																			// end
																			// char
		char checkCharLast = wordToCheck.charAt(0); // check the end char

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
				wordToCheck = wordToCheck.substring(0, wordToCheck.length() - 1);
				break;
			default:
				break;
		}

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

	public static void buildDictionarySet(Set<String> dictionarySet) throws IOException
	{
		BufferedReader reader = null;
		String s = null;
		String validWord = null;
		try
		{
			reader = new BufferedReader(new FileReader(inputString("Enter Source File: ")));

			while ((s = reader.readLine()) != null)
			{
				System.out.println(s);
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
		String currentLine = "", currentWord = "";

				StringTokenizer st = new StringTokenizer(out.toString()," ");

				while (st.hasMoreElements())
				{
					Integer i = null;
					currentWord = st.nextToken();

					currentWord = CheckWord(currentWord); // remove any
															// unwanted
															// chars

					if (currentWord == null)
						continue;

					if (dictionarySet.contains(currentWord))
						continue;

					//List<Integer> lines = wordMap.get(currentWord);

					//if (lines == null)
					//{
					//	lines = new ArrayList<Integer>();
					//	wordMap.put(currentWord, lines);
					//}
					wordMap.add(currentWord);
					//lines.add(LineNumber);
				}

	}

	public static void main(String arg[]) throws IOException
	{

		long processingStart = System.currentTimeMillis();
		Set<String> dictionarySet = new HashSet<String>();
		//Map<String, List<Integer>> wordMap = new TreeMap<String, List<Integer>>();
		List<String> wordMap = new ArrayList<String>();
	
		buildDictionarySet(dictionarySet);
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		while (true)
		{
			try
			{
				char c = (char) in.read();
				if (c != 13) // ASCII 4 04 EOT (end of transmission) ctrl D, I
							// may be wrong here
					out.append(c);
				else
					break;
			}
			catch (IOException e)
			{
				System.err.println("Error reading input");
			}
		}
		System.out.println(out.toString());
	

		System.out.println(out.toString());
		buildWordMap(out.toString(), wordMap, dictionarySet);

		System.out.println("\nMisspelled Words");
		System.out.println("=====================");

		System.out.println(dictionarySet);

		System.out.println(wordMap);

		for (String s: wordMap)
		{
			System.out.println(s);
		}

		long processingEnd = System.currentTimeMillis();

		System.out.println("\nTotal time taken : " + ((double) (processingEnd - processingStart) / 1000) % 60 + "seconds");
		System.out.println("\nNumber of misspelled words: " + wordMap.size());
	}
}