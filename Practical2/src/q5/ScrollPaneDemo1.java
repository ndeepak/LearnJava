package q5;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;

// creating a class ScrollPaneDemo1  
// for extending the JFrame  
public class ScrollPaneDemo1 extends JFrame {

// Declaring the objects of  
// the JScrollPane class  
	JScrollPane scrlpane;

// Constructor of the ScrollPaneDemo1 class  
	public ScrollPaneDemo1() {

// using to invoke the super class  
// methods and variables  
		super("JScrollPane Rating Display");

// Method to determine the size of the JFrame.  
		setSize(608, 808);

// Method to set the Default  
// tereminating operation of the JFrame.  
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inner(); // invoking the method inner

// Method for setting the   
// visibility of the JFrame.  
		setVisible(true);
	}

// method inner  
	public void inner() {

// Declaring the objects  
// of the JRadioButton class.  
		JRadioButton f[][] = new JRadioButton[12][5];

// to stores the ratings (1 stat, 2 star, etc)  
		String cnts[] = { "RATING ", "  *", " 2* ", "  3* ", "  4* ", "  5* " };

// to storing the string values  
		String ctg[] = { "CCNA", "Design Patterns", "Java", "Python", "Algorithms", "JAVASCRIPT", "Operating System",
				"CS Subject", "Data Structure", "PHP language", "Concurrency", "C #" };

// Declaration of objects  
// of the JPanel class.  
		JPanel panel = new JPanel();

// method to determine the size of the JFrame.  
		panel.setSize(610, 410);

// method to set the Layout of the JFrame.  
		panel.setLayout(new GridLayout(13, 6, 10, 0));

// for loop  
		for (int r = 0; r < 13; r++) {

// Declaring the objects  
// of the ButtonGroup class  
			ButtonGroup btngrp = new ButtonGroup();

			for (int c = 0; c < 6; c++) {

// for the 0th row  
				if (r == 0) {

// adding a new Jlabel  
					panel.add(new JLabel(cnts[c]));
				} else {
// for the 0th col  
					if (c == 0) {

// adding the new Jlabel  
						panel.add(new JLabel(ctg[r - 1]));
					}

					else {
						f[r - 1][c - 1] = new JRadioButton();

// adding the form in the ButtonGroup  
						btngrp.add(f[r - 1][c - 1]);

// adding the form in the JFrame  
						panel.add(f[r - 1][c - 1]);
					}
				}
			}
		}

// Declaring the objects  
// of the scrollpane class.  
		scrlpane = new JScrollPane(panel);

// for getting the content pane  
		getContentPane().add(scrlpane, BorderLayout.CENTER);
	}

// main method  
	public static void main(String argvs[]) {
		new ScrollPaneDemo1();
	}
}