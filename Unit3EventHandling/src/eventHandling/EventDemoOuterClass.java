package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//-----Event Handling using outer Class---
public class EventDemoOuterClass extends JFrame {
	JTextField tf;

	EventDemoOuterClass() {
		tf = new JTextField(15);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Click Me");
		btn.addActionListener(new Handler(this));// outer class is called
		add(tf);
		add(btn);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new EventDemoOuterClass();
	}
}

class Handler implements ActionListener {// outer class (class outside the class)
	EventDemoOuterClass ed;

	Handler(EventDemoOuterClass e) { // constructor
		ed = e;
	}

	public void actionPerformed(ActionEvent arg0) {
		ed.tf.setText("Welcome To Nepal");
	}
}
