// Name: Layla Gallez
// Data: 7/18/2020
// Description: Doing GUI's again
// File Name: ButtonGuiThree.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;

public class ButtonGuiThree extends JFrame
{
	private JFrame mainFrame;
	private JButton firstB;
	public ButtonGuiThree()
	{
		mainFrame = new JFrame("Example of a GUI with a button");

		firstB = new JButton("Press Me");

		Container c = mainFrame.getContentPane();

		c.add(firstB);

		firstB.setToolTipText("This is a button");
		firstB.setMnemonic('p');
		mainFrame.setSize(300,150);

		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0); }
		});

		ButEventHandler bhandler = new ButEventHandler();

		firstB.addActionListener(bhandler);

		mainFrame.setVisible(true);
	}

	class ButEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(null, "Button was Pressed",
				"Event Handler Message", JOptionPane.INFORMATION_MESSAGE);

			
			{
				mainFrame = new JFrame("Example of a GUI with a button");

				firstB = new JButton("This is the second time you need to press me");

				Container c = mainFrame.getContentPane();

				c.add(firstB);

				firstB.setToolTipText("This is a button");
				firstB.setMnemonic('p');
				mainFrame.setSize(300,150);

				mainFrame.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e) {System.exit(0); }
				});

				ButEventHandler bhandler = new ButEventHandler();

				firstB.addActionListener(bhandler);

				mainFrame.setVisible(true);
			}
		}

	}

	public static void main(String[] args)
	{
		new ButtonGuiThree();
	}

}

/*
JavaFiles🌸javac ButtonGuiThree.java 
JavaFiles🌸java ButtonGuiThree
JavaFiles🌸
*/
