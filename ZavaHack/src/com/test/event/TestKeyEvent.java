package com.test.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestKeyEvent implements KeyListener
{
	public static int kscounter = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println(kscounter);

	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar()==8)
		{
			
		}
		else
		{
			++kscounter;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

}
