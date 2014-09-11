package stringtest;

public class StringTest
{

	/**
	 * @param args
	 * 
	 */
	public static void testStringChar()
	{
		System.out.print("H" + "a");
		System.out.print('H' + 'a');
	}

	public static String getValue(String value)
	{
		return value.contains("&amp;") ? value.replaceAll("&amp;", "&") : value;
	}
	
	public static String getSubstringVal()
	{
		String wordToCheck = "(over";
		wordToCheck = wordToCheck.substring( 1, wordToCheck.length( ) );
		return wordToCheck;
	}

	static String s = "first";
	
	public static void testOutput(String str)
	{
		str = str+"second";
	}
	
	public static void main(String[] args)
	{
		//String x = "F&amp;C Capital &amp; Income Ord";

		//System.out.println(getValue(x));
		
		//testStringChar();
		
		testOutput(s);
		
		System.out.println("gtest: "+s);
		
	}

}
