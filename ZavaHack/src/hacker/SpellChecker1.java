package hacker;
/*      SpellChecker.java
 *      
 *		Coded by Joseph A. Marrero
 *		2/6/05
 */

import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
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

public class SpellChecker1 
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
	
	public static String CheckWord( String wordToCheck )
	{
		char checkChar = wordToCheck.charAt( wordToCheck.length( ) - 1 );	//check the end char
		
		switch( checkChar )
		{
			case '.':
			case '?':
			//case '!':
			//case '\'':
			//case '"':
			case ',':
			case ':':
			case ';':
				wordToCheck = wordToCheck.substring( 0, wordToCheck.length( ) - 1 );
				break;
			default:
				break;	
		}
		
		if( wordToCheck.length( ) < 1 )
			return null;
		
		for( int idx = 0; idx < wordToCheck.length( ); idx++ )
			if( !Character.isLetter( wordToCheck.charAt( idx ) ) )
				return null;

		return wordToCheck.toLowerCase( );
	}
	
	public static void buildDictionarySet( Set<String> dictionarySet ) throws IOException
	{
		LineNumberReader lnr = null;
		String  currentLine = "";
		
		try
		{
			lnr = new LineNumberReader( new FileReader( inputString( "Dictionary: " ) ) );
			
			while( ( currentLine = lnr.readLine( ) ) != null )
				dictionarySet.add( currentLine );
					
			lnr.close( );
		}
		catch( IOException e )
		{
			System.out.println( "IOException on building dictionary set." );
			System.out.println( e );
		}
		finally
		{
			
			if(lnr != null )
				lnr.close( );
		}
	}
	
	public static void buildWordMap( Map<String, List<Integer>> wordMap, Set<String> dictionarySet ) throws IOException
	{
		LineNumberReader lnr = null;
		String  currentLine = "",
				currentWord = "";
				
		try 
		{
			lnr = new LineNumberReader( new FileReader( inputString( "Document: " ) ) );
			
			while( ( currentLine = lnr.readLine( ) ) != null )
			{
				int LineNumber = lnr.getLineNumber( );
				StringTokenizer st = new StringTokenizer( currentLine );
				
           		
				while( st.hasMoreElements( ) )
				{
					Integer i = null;
					currentWord = st.nextToken( );
					
					currentWord = CheckWord( currentWord ); //remove any unwanted chars
					
					if( currentWord == null )
						continue;
					
					if( dictionarySet.contains( currentWord ) )
					 	continue;
					 
					List<Integer> lines = wordMap.get( currentWord );
					
					if( lines == null )
					{
                		lines = new ArrayList<Integer>( );
                		wordMap.put( currentWord, lines );
           			}
           			
           			//if(lines.size() > 0)
           			//	i = lines.get( lines.size() - 1);
           	
           			//if(  i != null && i.intValue() != LineNumber )
           			lines.add( LineNumber ); 
				}			
			}
		}
		catch( IOException e )
		{
			System.out.println( "IOException building word map." );
			System.out.println( e );
		}
		finally
		{
			
			if( lnr != null )
				lnr.close( );
		}
	}
	
	public static void main( String arg[] ) throws IOException
	{
		

		Set<String> dictionarySet = new HashSet<String>( );
		Map<String, List<Integer>>  wordMap = new TreeMap<String, List<Integer>>( );
		

		buildDictionarySet( dictionarySet );
		buildWordMap( wordMap, dictionarySet );
		
		System.out.println( "\nMisspelled Words" );
		System.out.println( "=====================" );
		
		
	    for( Map.Entry<String,List<Integer>> thisNode : wordMap.entrySet( ) )
        {
            Iterator<Integer> lineItr = thisNode.getValue( ).iterator( );

                // Print identifier and first line where it occurs
            System.out.print( thisNode.getKey( ) + ": " );
            System.out.print( lineItr.next( ) );
            
                // Print all other lines on which it occurs
            while( lineItr.hasNext( ) )
                System.out.print( ", " + lineItr.next( ) );
            System.out.println( "." );    
        }
        
        System.out.println("\nNumber of misspelled words: " + wordMap.size( ) );
	}
}