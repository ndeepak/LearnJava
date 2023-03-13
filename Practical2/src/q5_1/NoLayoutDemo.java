package q5_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoLayoutDemo extends JFrame {
	public NoLayoutDemo() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("NoLayout Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JLabel label = new JLabel("First Name:");
		label.setBounds(20, 20, 100, 20);
		JTextField textField = new JTextField();
		textField.setBounds(124, 25, 100, 20);
		frame.add(label);
		frame.add(textField);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new NoLayoutDemo();
	}
}
