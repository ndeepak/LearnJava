package q2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ProgressBarDemo extends JFrame {
//	JList list;
//	JTree tree;
//	JTable table;
	JProgressBar bar;
//	JScrollPane scroll;

	@SuppressWarnings("unchecked")
	public ProgressBarDemo() {
		setSize(200, 200);
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JProgressBar");
		
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));
//-----Creating ProgressBar-----
		JButton btn = new JButton("Click to Progress!");
		bar = new JProgressBar();
		bar.setStringPainted(true);
		btn.addActionListener(new ActionListener() {
			int count = 0;

			public void actionPerformed(ActionEvent arg0) {
				count = count + 5;
				bar.setValue(count);
			}
		});
		add(btn, BorderLayout.SOUTH);
		add(bar);
		setVisible(true);
	}

	public static void main(String[] args) {
		ProgressBarDemo frame = new ProgressBarDemo();
	}
}