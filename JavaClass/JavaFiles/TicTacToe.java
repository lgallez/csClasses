// Name: Layla Gallez
// Data: 7/25/2020
// Description: Final Project
// File Name: TicTacToe.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;
import java.util.Random;

public class TicTacToe extends JFrame
{
	private JFrame mainFrame;

	Random rndm = new Random();
	private int randomOneOrZero = rndm.nextInt(2);
	private int xo = randomOneOrZero;

	//create an array of buttons b[][]
	private JButton b[][] = {
		{new JButton("00"), new JButton("01"), new JButton("02")},
		{new JButton("10"), new JButton("11"), new JButton("12")},
		{new JButton("20"), new JButton("21"), new JButton("22")},
	};

	public TicTacToe()
	{
		mainFrame = new JFrame("Tic Tac Toe");

		//get the content pane
		Container c = mainFrame.getContentPane();

		c.setLayout(new GridLayout(3,3));

		//add the buttons b[][] to the CurrentPane
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				c.add(b[i][j]);
			}
		}

		mainFrame.setSize(600,350);

		//define and register window evernt handler
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});

		//create and register the button event handlers
		ButtonsHandler buttonsHandler = new ButtonsHandler();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				b[i][j].addActionListener(buttonsHandler);
			}
		} 

		mainFrame.setVisible(true);
	}

	class ButtonsHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int counteri = 0;
			int counterj = 0;

			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(e.getSource() == b[i][j])
					{
						counteri = i;
						counterj = j;
					}
				}
			}

			if(xo == 1)
			{
				if(b[counteri][counterj].getIcon() == null || b[counteri][counterj].getIcon().toString() != "o.png")
				{
					b[counterj][counterj].setIcon(new ImageIcon("x.png"));
					b[counterj][counterj].setText("");
					xo = 0;
				}					
			}

			else if(xo == 0)
			{
				if(b[counteri][counterj].getIcon() == null || b[counteri][counterj].getIcon().toString() != "x.png")
				{
					b[counterj][counterj].setIcon(new ImageIcon("o.png"));
					b[counterj][counterj].setText("");
					xo = 1;
				}		
			}

			for(int i=0; i<3; i++)
			{
				if(b[i][0].getIcon() != null && b[i][1].getIcon() != null && b[i][2].getIcon() != null)
				{
					if(b[i][0].getIcon().toString() == b[i][1].getIcon().toString() && b[i][1].getIcon().toString() == b[i][2].getIcon().toString())
					{
						System.out.print("We have a winner... ");
						if (b[i][2].getIcon().toString() == "x.png")
						{
							System.out.println("X Wins!");
							System.exit(0);
						}
						if (b[i][2].getIcon().toString() == "o.png")
						{
							System.out.println("O Wins!");
							System.exit(0);
						}
					}
				}

			

			
				if(b[0][i].getIcon() != null && b[1][i].getIcon() != null && b[2][i].getIcon() != null)
				{
					if(b[0][i].getIcon().toString() == b[1][i].getIcon().toString() && b[1][i].getIcon().toString() == b[2][i].getIcon().toString())
					{
						System.out.print("We have a winner... ");
						if (b[2][i].getIcon().toString() == "x.png")
						{
							System.out.println("X Wins!");
							System.exit(0);
						}
						if (b[2][i].getIcon().toString() == "o.png")
						{
							System.out.println("O Wins!");
							System.exit(0);
						}
					}
				}
			

				if(b[1][1].getIcon() != null && b[0][0].getIcon() != null && b[2][2].getIcon() != null)
				{
					if(b[0][0].getIcon().toString() == b[1][1].getIcon().toString() && b[1][1].getIcon().toString() == b[2][2].getIcon().toString())
					{
						System.out.print("We have a winner... ");
						if (b[1][1].getIcon().toString() == "x.png")
						{
							System.out.println("X Wins!");
							System.exit(0);
						}
						else 
						{
							System.out.println("O Wins!");
							System.exit(0);
						}
					}
				}

				else if (b[1][1].getIcon() != null && b[2][0].getIcon() != null && b[0][2].getIcon() != null)
				{
					if(b[2][0].getIcon().toString() == b[1][1].getIcon().toString() && b[1][1].getIcon().toString() == b[0][2].getIcon().toString())
					{
						System.out.print("We have a winner... ");
						if (b[1][1].getIcon().toString() == "x.png")
						{
							System.out.println("X Wins!");
							System.exit(0);
						}
						else 
						{
							System.out.println("O Wins!");
							System.exit(0);
						}
					}
				}
			}				
		}
	}

	public static void main(String args [])
	{
		new TicTacToe();
	}
}

/*
JavaFiles🌸javac TicTacToe.java 
JavaFiles🌸java TicTacToe
We have a winner... O Wins!
JavaFiles🌸
*/