package com.test.gui;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import com.test.gui.TextClock1.ClockListener;

public class HelloWorldGUI2
{

	// ============================================================== fields
	private static JLabel			timeField;	// set by timer listener
	private static JLabel timeLbl = new JLabel();
	private static javax.swing.Timer t = new javax.swing.Timer(1000, new StopWatchListener());
	private static javax.swing.Timer t1 = new javax.swing.Timer(1000, new ClockListener());
	private static JTextArea area = null;
	private static JLabel filenameLabel = null;
	private static JTextField filenameTxtfield = null;
	private static JLabel showOutputLabel = null;
	private static JPanel resultPanel = null;
	
	private static long processingStart;
	private static long processingEnd;
	
	
	private static String[] resultArr = null;
	
	
	private static class StopWatchListener implements ActionListener
	{
		private int clockTick = 0;  	
		private double clockTime;  	
		private String clockTimeString;

		public void actionPerformed(ActionEvent e)
		{
			clockTick++;
			clockTime = ((double)clockTick)/10.0;
			clockTimeString = new Double(clockTime).toString();
			timeLbl.setFont(new Font("Serif", Font.PLAIN, 16));
			timeLbl.setText("Time elapsed : "+clockTimeString);
		}
	}
	
	private static class ClockListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
            Calendar now = Calendar.getInstance();
            int h = now.get(Calendar.HOUR_OF_DAY);
            int m = now.get(Calendar.MINUTE);
            int s = now.get(Calendar.SECOND);
            timeField.setText("" + h + ":" + m + ":" + s);
		}
	}

	private static class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	private static class ButtonHandlerStart implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			processingStart = System.currentTimeMillis();
			area.setEditable(true);
			t.restart();
			t1.restart();
		}
	}

	private static class ButtonHandlerStop implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			processingEnd = System.currentTimeMillis();
			area.setEditable(false);
			
			try
			{
				resultArr = SpellChecker.evalTyping(area.getText(), filenameTxtfield.getText());
			}
			catch (IOException e1)
			{
				e1.printStackTrace();
			}
			
			String resultText = "Result:[ Speed (CPM) :" + resultArr[0] + "; Total time :"+ TimeUnit.MILLISECONDS.toMinutes(processingEnd - processingStart) + "; No. of mistakes :" + resultArr[1] +"";
			System.out.println(resultText);
			showOutputLabel.setText(resultText);
			resultPanel.setVisible(true);
			t.stop();
			t1.stop();
		}
	}

	public static void main(String[] args)
	{
		JButton okButton = new JButton("Exit");
		// okButton.sets
		JButton startButton = new JButton("Start Test");
		JButton stopButton = new JButton("Stop Test");
		
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);

		ButtonHandlerStart startListener = new ButtonHandlerStart();
		startButton.addActionListener(startListener);
		
		ButtonHandlerStop stopListener = new ButtonHandlerStop();
		stopButton.addActionListener(stopListener);
		
		JPanel contentText = new JPanel();
		GridLayout layout = new GridLayout(1, 1);
		contentText.setLayout(layout);
		area = new JTextArea(31, 10);
		area.setEditable(false);
		contentText.add(area);

		JPanel contentButton = new JPanel();
		GridLayout layout1 = new GridLayout(1, 3);
		contentButton.setLayout(layout1);
		contentButton.add(okButton);
		contentButton.add(startButton);
		contentButton.add(stopButton);

		// ----------clock------------//
		// ... Set characteristics of text field that shows the time.
		timeField = new JLabel();
		//timeField.setEditable(false);
		timeField.setFont(new Font("sansserif", Font.PLAIN, 12));

		JPanel contentField = new JPanel();
		GridLayout layout3 = new GridLayout(1, 4);
		contentField.setLayout(layout3);
		filenameLabel = new JLabel();
		filenameLabel.setText("Enter source filename: ");
		filenameTxtfield = new JTextField(1);
		contentField.add(timeField);
		contentField.add(timeLbl);
		contentField.add(filenameLabel);
		contentField.add(filenameTxtfield);
		
		resultPanel = new JPanel();
		contentField.setLayout(layout);
		showOutputLabel = new JLabel();
		resultPanel.add(showOutputLabel);
		resultPanel.setVisible(true);

		JPanel content = new JPanel();
		BoxLayout layout2 = new BoxLayout(content, BoxLayout.Y_AXIS);
		//FlowLayout layout2 = new FlowLayout();
		content.setLayout(layout2);
		//content.add(resultPanel, BorderLayout.NORTH);
		content.add(contentText, BorderLayout.PAGE_START);
		content.add(resultPanel);
		content.add(contentField);
		content.add(contentButton, BorderLayout.PAGE_END);
		JFrame window = new JFrame("GUI Test ");
		window.setContentPane(content);
		window.setSize(600, 600);
		window.setLocation(100, 100);
		window.setVisible(true);
	}
}