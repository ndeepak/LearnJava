package layoutManagement;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame
{
	JButton btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8;
	public GridLayoutDemo()
	{
		super("Grid Layout Frame"); 
		setSize(300, 300);
		setLayout(new GridLayout(2,3, 10,10)); // row by column grid size
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		btn5 = new JButton("Button 5");
		btn6 = new JButton("Button 6");
		btn7 = new JButton("Button 7");
		btn8 = new JButton("Button 8");
		
		
		add(btn1); 
		add(btn2); 
		add(btn3); 
		add(btn4);
		add(btn5); 
		add(btn6); 
		add(btn7); 
		add(btn8);
		add(new JButton("Button 5"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new GridLayoutDemo();
	}

}
