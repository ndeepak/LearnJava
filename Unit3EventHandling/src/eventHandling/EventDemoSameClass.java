package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventDemoSameClass extends JFrame implements ActionListener {
	JTextField tf;

	public EventDemoSameClass() {
		tf = new JTextField(15);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Click Me");
		btn.addActionListener(this);
		add(tf);
		add(btn);
		setSize(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		tf.setText("Welcome to Nepal");
	}

	public static void main(String[] args) {
		new EventDemoSameClass();
	}
}
