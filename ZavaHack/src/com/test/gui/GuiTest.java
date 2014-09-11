package com.test.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuiTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		JPanel contentText = new JPanel();
		
		GridLayout layout = new GridLayout(1,1);
		GridLayout layout1 = new GridLayout(1,2);
		contentText.setLayout(layout);
		JTextArea area = new JTextArea(10,10);
		contentText.add(area);
		
		JPanel contentField = new JPanel();
		contentField.setLayout(layout1);
		JLabel label = new JLabel();
		label.setText("Enter source filename: ");
		JTextField field = new JTextField(1);
		contentField.add(label);
		contentField.add(field);
		
		
		JPanel content = new JPanel();
		BorderLayout layout2 = new BorderLayout();
		content.setLayout(layout2);
		content.add(contentText, BorderLayout.NORTH);
		content.add(contentField, BorderLayout.SOUTH);
		
		JFrame window = new JFrame("GUI Test ");
		window.setContentPane(content);
		window.setSize(400, 400);
		window.setLocation(100, 100);
		window.setVisible(true);
	}

}
