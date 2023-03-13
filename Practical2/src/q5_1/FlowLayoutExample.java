package q5_1;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
	JFrame frame;

// constructor    
	FlowLayoutExample() {
		// creating a frame object
		frame = new JFrame();

		// creating the buttons
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");

		// adding the buttons to frame
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);

		// parameterized constructor is used
		// where alignment is left
		// horizontal gap is 20 units and vertical gap is 25 units.
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));

		frame.setSize(330, 250);
		frame.setVisible(true);
		frame.setTitle("FlowLayout");
	}

// main method  
	public static void main(String argvs[]) {
		new FlowLayoutExample();
	}
}
