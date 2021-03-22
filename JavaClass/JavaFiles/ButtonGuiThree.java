// Name: Layla Gallez
// Data: 7/22/2020
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
		mainFrame = new JFrame("A Box With Layla's Name");

		firstB = new JButton("Press Me");

		Container c = mainFrame.getContentPane();

		c.add(firstB);

		firstB.setToolTipText("Click here to find out Layla's name");
		firstB.setMnemonic('m');
		mainFrame.setSize(200,75);

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
			JOptionPane.showMessageDialog(null, "Layla Gallez \n" + "31 Spooner St. Quahog, Rhode Island",
				"There You Have It", JOptionPane.INFORMATION_MESSAGE);
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
