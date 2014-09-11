package javakeyboardinput;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.HashSet;
import java.util.Set;

public class TestKeyboardInput
{

	public static String validWord(String wordToCheck)
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
		LineNumberReader lnr = null;
		String currentLine = "";

		try
		{
			lnr = new LineNumberReader(new FileReader("c:/test/dictionary.txt"));

			while ((currentLine = lnr.readLine()) != null)
				dictionarySet.add(currentLine);

			lnr.close();
		}
		catch (IOException e)
		{
			System.out.println("IOException on building dictionary set.");
			System.out.println(e);
		}
		finally
		{

			if (lnr != null)
				lnr.close();
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
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
	}

}
