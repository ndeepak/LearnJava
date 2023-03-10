package quesNine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame implements ActionListener {
	JTextField tf;
	JLabel l, lbl;
	JButton b;

	LabelExample() {
		lbl = new JLabel("Enter the host address: ");
		lbl.setBounds(50, 30, 150, 20);
		tf = new JTextField();
		tf.setBounds(50, 50, 150, 20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		b = new JButton("Find IP");
		b.setBounds(50, 150, 95, 30);
		b.addActionListener(this);
		add(lbl);
		add(b);
		add(tf);
		add(l);
		setTitle("JTextField with Event Handling");
		setSize(350, 250);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new LabelExample();
	}
}