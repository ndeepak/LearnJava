package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ActionCommandsDemo extends JFrame implements ActionListener {
	JLabel lb;

	ActionCommandsDemo() {
		lb = new JLabel();
		setLayout(new FlowLayout());
		JButton btn1 = new JButton("Continue");
		JButton btn2 = new JButton("OK");
		add(lb);
		add(btn1);
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn1.setActionCommand("Proceed"); // set action commands
		btn2.setActionCommand("Proceed"); // set action commands
		setSize(200, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Proceed")
			;// get action commands
		lb.setText("Do you want to Proceed??");
	}

	public static void main(String[] args) {
		new ActionCommandsDemo();
	}
}
