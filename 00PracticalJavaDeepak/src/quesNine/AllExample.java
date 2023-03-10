package quesNine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AllExample extends JFrame implements ActionListener {
	// Label
	JTextField tf;
	JLabel l;
	JButton b;

	// Text Field
	JTextField tf1, tf2, tf3;
	JButton b1, b2;

	// Label Example
	AllExample() {
		JFrame f = new JFrame();
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);

		// Text Field

		tf1 = new JTextField();
		tf1.setBounds(50, 200, 150, 20);
		tf2 = new JTextField();
		tf2.setBounds(50, 250, 150, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 300, 150, 20);
		tf3.setEditable(false);
		b1 = new JButton("+");
		b1.setBounds(50, 350, 50, 50);
		b2 = new JButton("-");
		b2.setBounds(120, 400, 50, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	// Label Example
	public void actionPerformed(ActionEvent e) {

		// Text Field
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = 0;
		if (e.getSource() == b1) {
			c = a + b;
		} else if (e.getSource() == b2) {
			c = a - b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void main(String[] args) {
		new AllExample();
	}
}