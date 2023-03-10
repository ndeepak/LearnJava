package differentEventPackage;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame implements KeyListener {

	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;

	public KeyEventDemo() {
		firstlbl = new JLabel("First Number: ");
		secondlbl = new JLabel("Second Number: ");
		resultlbl = new JLabel("Result ");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		resulttxt.addKeyListener(this);
		// JFrame Configuration
		setTitle("Action Event Handle Frame");
		setSize(400, 400);
		setLayout(new GridLayout(4, 2));

		// Adding Components to JFrame
		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new KeyEventDemo();
	}

	public void keyTyped(KeyEvent e) {
		resultlbl.setText("Key is typed");
	}

	public void keyPressed(KeyEvent e) {
		int first = Integer.parseInt(firsttxt.getText()); // "23"= 23 , string to integer conversion
		int second = Integer.parseInt(secondtxt.getText());
		int result = 0;
		if (e.getKeyChar() == 'a') {
			result = first + second;
		} else if (e.getKeyChar() == 'a') {
			result = first - second;
		} else if (e.getKeyChar() == 'd') {
			result = first / second;
		} else if (e.getKeyChar() == 'r') {
			result = first % second;
		} else {
			JOptionPane.showMessageDialog(this, "No Operations selected");
		}
		resulttxt.setText(String.valueOf(result)); // Converts integer to string
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
