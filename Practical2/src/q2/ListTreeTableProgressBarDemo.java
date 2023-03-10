package q2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ListTreeTableProgressBarDemo extends JFrame {
	JList list;
	JTree tree;
	JTable table;
	JProgressBar bar;
	JScrollPane scroll;

	@SuppressWarnings("unchecked")
	public ListTreeTableProgressBarDemo() {
		setSize(400, 600);
		setDefaultLookAndFeelDecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Advanced Components");
		setLayout(new FlowLayout(20, 10, FlowLayout.CENTER));
//-----Creating List-----
		String items[] = { "Apple", "Banana", "Mango", "Pineapple", "Guava" };
		list = new JList(items);
		list.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		add(list);
//----Creating Tree--------
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
		DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
		root.add(vegetableNode);
		root.add(fruitNode);
		tree = new JTree(root);
		add(tree);
//----Creating Table----------
		String[] cn = { "Title", "Artist", "Album" };
		String[][] data = { { "A1", "Aani", "x1" }, { "A2", "Haren", "x2" } };
		table = new JTable(data, cn);
		scroll = new JScrollPane(table);
		add(scroll);
//-----Creating ProgressBar-----
		JButton btn = new JButton("Progress");
		bar = new JProgressBar();
		btn.addActionListener(new ActionListener() {
			int count = 0;

			public void actionPerformed(ActionEvent arg0) {
				count = count + 10;
				bar.setValue(count);
			}
		});
		add(btn, BorderLayout.SOUTH);
		add(bar);
		setVisible(true);
	}

	public static void main(String[] args) {
		ListTreeTableProgressBarDemo frame = new ListTreeTableProgressBarDemo();
	}
}