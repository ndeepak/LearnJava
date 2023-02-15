package differentEventPackage;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
// Difference between listener and adapter --> usability
public class VowelCons extends KeyAdapter
{
	JFrame frame;
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;
	
	public VowelCons()
	{
		frame = new JFrame();
		firstlbl = new JLabel("First Number: ");
		resultlbl = new JLabel("Result ");
		firsttxt = new JTextField(20);
		resulttxt = new JTextField(20);
		resulttxt.addKeyListener(this);
		// JFrame Configuration
		frame.setTitle("Action Event Handle Frame");
		frame.setSize(400, 400);
		frame.setLayout(new GridLayout(4,2));
		
		// Adding Components to JFrame
		frame.add(firstlbl); 
		frame.add(firsttxt);
		frame.add(resultlbl); 
		frame.add(resulttxt);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void keyPressed(KeyEvent e)
	{
		int first = Integer.parseInt(firsttxt.getText()); //  "23"= 23 , string to integer conversion
		int second = Integer.parseInt(secondtxt.getText());
		int result = 0;
		switch (e.getKeyChar()) {
        	case 'a':
        	case 'e':
        	case 'i':
        	case 'o':
        	case 'u':
        System.out.println(e + " is vowel");
            break;
        default:
            System.out.println(e + " is consonant");
		}
//		if(e.getKeyChar() == 'a')
//		{
//			result= first+second;
//		}
//		else if(e.getKeyChar()=='a')
//		{
//			result = first-second;
//		}
//		else if(e.getKeyChar()=='d')
//		{
//			result = first/second;
//		}
//		else if(e.getKeyChar()=='r')
//		{
//			result = first%second;
//		}
//		else
//		{
//			JOptionPane.showMessageDialog(frame, "No Operations selected");
//		}
//		resulttxt.setText(String.valueOf(result)); // Converts integer to string
//	}
	public static void main(String[] args) 
	{
		new VowelCons();
	}

}
