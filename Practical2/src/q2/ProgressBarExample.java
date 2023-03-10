package q2;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarExample extends JFrame {
	JProgressBar jb;

	ProgressBarExample() {
		setSize(280, 200);
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBar");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));
		JButton btn = new JButton("Click to Progress!");
		jb = new JProgressBar();
		jb.setStringPainted(true);
		jb.setValue(0);
		btn.addActionListener(new ActionListener() {
			int count = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				count = count + 5;
				jb.setValue(count);
			}
		});
		add(btn, BorderLayout.SOUTH);
		add(jb);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ProgressBarExample();
	}
}