package q5_1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutDemo extends JPanel {

	JButton b1, b2, b3, b4, b5;
	GridBagConstraints gbc = new GridBagConstraints();

	public GridBagLayoutDemo() {
		b1 = new JButton("First");
		gbc.insets = new Insets(5, 5, 5, 5);
		setLayout(new GridBagLayout());

		// 0,0 Positioning in JPanel
		gbc.gridx = 0; // button1 is added to JFrame in 1,1 Position
		gbc.gridy = 0;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.VERTICAL;

		add(b1, gbc); // Button 1 is Added to JPanel in 0,0 position

		b2 = new JButton("Second"); // button2 is added to JFrame in 2,2 Position
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		add(b2, gbc);

		b3 = new JButton("Third "); // button3 is added to JFrame in 3,3 Position
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		add(b3, gbc);

		b4 = new JButton("Fourth ");// button4 is added to JFrame in 1,1 Position
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		add(b4, gbc);

		b5 = new JButton("Fifth "); // button4 is added to JFrame in 0,4 Position
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b5, gbc);

	}

	public static void main(String[] args) {
		GridBagLayoutDemo panel = new GridBagLayoutDemo();
		panel.setBackground(Color.gray);
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setSize(400, 200);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("GridBagLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
