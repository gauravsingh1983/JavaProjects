package stringtest;

public class CountWordInString
{

	public int countWordsInString(String str, String word)
	{
		int cntr = 0;
		while (str.contains(word))
		{
			// System.out.println(str);
			if (str.indexOf(word) > -1)
			{
				++cntr;
				str = str.substring(0, str.indexOf(word)).concat(str.substring(str.indexOf(word) + 2, str.length()));
				// System.out.println(str);
			}
		}

		return cntr;
	}

	public int countHi(String str)
	{
		int count = 0;
		// Loop to length-1 so we can access index i and i+1 in the loop.
		for (int i = 0; i < (str.length() - 1); i++)
		{
			if (str.substring(i, i + 2).equals("hi"))
				count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		String str = "ABChi hi";
		CountWordInString wordInString = new CountWordInString();

		System.out.println(wordInString.countWordsInString(str, "hi"));
	}
}
