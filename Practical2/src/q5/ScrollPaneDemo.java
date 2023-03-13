package q5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ScrollPaneDemo extends JFrame {
	public ScrollPaneDemo() {
		super("ScrollPane Demo");
		ImageIcon img = new ImageIcon("E:\\01 Learn Java\\LearnJava\\Practical2\\src\\q5\\Capture.png");

		JScrollPane png = new JScrollPane(new JLabel(img));

		getContentPane().add(png);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScrollPaneDemo();
	}
}