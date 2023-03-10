package eventHandling;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DelegationModelDemo extends JFrame implements ActionListener {
	JTextField t1;
	private JTextField t3;
	JTextField t2;
	private JLabel l1, l2, l3;
	private JButton b1, b2;

	public DelegationModelDemo() {
		super("Handling Action Events");
		l1 = new JLabel("First Value");
		t1 = new JTextField(10);
		l2 = new JLabel("Second Value");
		t2 = new JTextField(10);
		l3 = new JLabel("Result");
		t3 = new JTextField(10);
		b1 = new JButton("+");
		b2 = new JButton("-");
		b1.addActionListener(this); // ’this’ represent a class that implements ActionListener
		b2.addActionListener(this); // ’this’ represent a class that implements ActionListener
		setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));// gaps between components hor, vert
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		setSize(400, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int x, y, z;
		x = Integer.parseInt(t1.getText());// values come from textfields are always of string type
		y = Integer.parseInt(t2.getText());// so Iteger,parseInt() change the type from string to int.
		if (e.getActionCommand() == "+") // if event is of name +
			z = x + y;
		else
			z = x - y;
		t3.setText(String.valueOf(z)); // as z is integer type, textfield always set the string.
	}

	public static void main(String[] args) {
		new DelegationModelDemo();
	}
}