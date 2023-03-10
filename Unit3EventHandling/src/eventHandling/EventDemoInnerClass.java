package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventDemoInnerClass extends JFrame {
	JTextField tf;

	public EventDemoInnerClass() {
		tf = new JTextField(15);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Click Me");
		btn.addActionListener(new EventHandlerNew()); // anonymous inner class
		add(tf);
		add(btn);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventDemoInnerClass();
	}

	class EventHandlerNew implements ActionListener { // inner class (class within class)
		public void actionPerformed(ActionEvent e) {
			tf.setText("Welcome to Nepal");
		}
	}
}