// Name: Layla Gallez
// Data: 7/22/2020
// Description: Doing second window GUI's
// File Name: SecondWindow.java

import javax.swing.*;
import java.awt.event.*;

public class SecondWindow extends JFrame
{
	private JFrame mainFrame;

	public SecondWindow()
	{
		mainFrame = new JFrame("Second GUI Window");
		mainFrame.setSize(300,150);
		mainFrame.setVisible(true);

		WinHandler handler = new WinHandler();
		mainFrame.addWindowListener(handler);
	}

	public static void main(String[] args)
	{
		new SecondWindow();
	}

	class WinHandler implements WindowListener

	{
		public void windowClosing(WindowEvent e)	{System.exit(0);}
		public void windowClosed(WindowEvent e)		{	}
		public void windowOpened(WindowEvent e)		{	}
		public void windowIconified(WindowEvent e)	{	}
		public void windowDeiconified(WindowEvent e){	}
		public void windowActivated(WindowEvent e)	{	}
		public void windowDeactivated(WindowEvent e){	}
	}
}

/*
JavaFiles🌸javac SecondWindow.java 
JavaFiles🌸java SecondWindow
JavaFiles🌸
*/