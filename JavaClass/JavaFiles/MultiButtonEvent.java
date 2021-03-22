// Name: Layla Gallez
// Data: 7/25/2020
// Description: Adding Multiple Componets
// File Name: AddingMultipleComponets.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class MultiButtonEvent extends JFrame
{
	private JFrame mainFrame;
	private JButton messageButton;
	private JButton clearButton;
	private JButton exitButton;

	public MultiButtonEvent()
	{
		mainFrame = new JFrame("The Hello Application - Ver 1.0");

		//create the button objects
		messageButton = new JButton("What do you see?");
		clearButton = new JButton("What did you say");
		exitButton = new JButton("What was that???");

		//get the content pane * specify layout manager
		Container c = mainFrame.getContentPane();
		c.setLayout(new FlowLayout());

		//add the button to the CurrentPane
		c.add(messageButton);
		c.add(clearButton);
		c.add(exitButton);

		//create accelerator keys
		messageButton.setMnemonic('s');
		clearButton.setMnemonic('k');
		exitButton.setMnemonic('h');

		mainFrame.setSize(200,150);

		//create and register the button event handlers
		MessageButtonHandler mhandler = new MessageButtonHandler();
		messageButton.addActionListener(mhandler);

		ClearButtonHandler chandler = new ClearButtonHandler();
		clearButton.addActionListener(chandler);

		ExitButtonHandler ehandler = new ExitButtonHandler();
		exitButton.addActionListener(ehandler);

		//define and register window event handler
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});

		mainFrame.setVisible(true);
	}


class MessageButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "See no evil",
			"Event Handler Message",
			JOptionPane.INFORMATION_MESSAGE);
	}
}

class ClearButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Speak no evil",
			"Event Handler Message",
			JOptionPane.INFORMATION_MESSAGE);
	}
}

class ExitButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(null, "Hear no evil",
			"Event Handler Message",
			JOptionPane.INFORMATION_MESSAGE);
	}
}

public static void main(String args[])
{
	MultiButtonEvent app;
	app = new MultiButtonEvent();
}
}

/*
JavaFiles🌸javac MultiButtonEvent.java 
JavaFiles🌸java MultiButtonEvent
JavaFiles🌸
*/