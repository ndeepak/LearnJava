package q5_1;

import javax.swing.GroupLayout;
import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("GroupLayoutExample");
		Container contentPanel = frame.getContentPane();
		GroupLayout groupLayout = new GroupLayout(contentPanel);
		contentPanel.setLayout(groupLayout);
		JLabel clickMe = new JLabel("Click Here");
		JButton button = new JButton("This Button");
		groupLayout.setHorizontalGroup(
				groupLayout.createSequentialGroup().addComponent(clickMe).addGap(10, 20, 100).addComponent(button));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(clickMe).addComponent(button));
		frame.setVisible(true);

		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}