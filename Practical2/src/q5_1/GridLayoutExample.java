package q5_1;

import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {

	JFrame frameObj;

// constructor  
	GridLayoutExample() {
		frameObj = new JFrame();

// creating 9 buttons  
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");

// adding buttons to the frame  
// since, we are using the parameterless constructor, therefore;   
// the number of columns is equal to the number of buttons we   
// are adding to the frame. The row count remains one.  
		frameObj.add(btn1);
		frameObj.add(btn2);
		frameObj.add(btn3);
		frameObj.add(btn4);
// setting the grid layout   
// a 3 * 3 grid is created with the horizontal gap 20   
// and vertical gap 25  
		frameObj.setLayout(new GridLayout(3, 3, 20, 25));
		frameObj.setSize(400, 400);
		frameObj.setTitle("GridLayout");
		frameObj.setVisible(true);
	}

// main method  
	public static void main(String argvs[]) {
		new GridLayoutExample();
	}
}