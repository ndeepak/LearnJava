package layoutManagement;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
{
	JButton btn1, btn2, btn3, btn4;
	public BorderLayoutDemo() 
	{
		
		super("Border Layout Frame");
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		setLayout(new BorderLayout(10,10)); //hgap, vgap - horizontal and vertical gap
		add(btn2, BorderLayout.WEST); 
		add(btn3, BorderLayout.NORTH); 
		add(btn4, BorderLayout.SOUTH);
		add(new JButton("Button 5"),BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminate the background running JFrame
	}
	public static void main(String[] args) 
	{
		new BorderLayoutDemo();
	}

}
