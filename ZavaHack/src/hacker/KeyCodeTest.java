package hacker;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyCodeTest extends Component
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		KeyCodeTest codeTest = new KeyCodeTest();
		codeTest.addKeyListener(new KeyCodeTest1());
			
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		while (in.read()!=27)
		{
			try
			{
				char c = (char) in.read();
				
				out.append(c);

			}
			catch (IOException e)
			{
				System.err.println("Error reading input");
			}
		}
		
		System.out.println(out.toString());

	}
}


class KeyCodeTest1 implements KeyListener
{

	@Override
	public void keyTyped(KeyEvent e)
	{
	    if(e.getKeyCode() == KeyEvent.VK_ENTER)
	    {
	        System.exit(0);
	    }
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
	    if(e.getKeyCode() == KeyEvent.VK_ENTER)
	    {
	        System.exit(0);
	    }
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
	    if(e.getKeyCode() == KeyEvent.VK_ENTER)
	    {
	        System.exit(0);
	    }
		
	}

}
