package q1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TableTree {
	JFrame f;

	TableTree() {
		f = new JFrame();
		String data[][] = { { "101", "Deepak", "6700" }, { "102", "Samjhana", "7800" },
				{ "103", "Sam", "100000" } };
		String column[] = { "ID", "NAME", "SALARY(USD)" };
		JTable jt1 = new JTable(data, column);
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
		style.add(color);
		style.add(font);
		DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
		color.add(red);
		color.add(blue);
		color.add(black);
		color.add(green);
//		DefaultMutableTreeNode newRoman = new DefaultMutableTreeNode("New Roman Times");
//		DefaultMutableTreeNode serif = new DefaultMutableTreeNode("Liberation Serif");
//		DefaultMutableTreeNode dejavu = new DefaultMutableTreeNode("Dejavu Sans");
//		DefaultMutableTreeNode segoe = new DefaultMutableTreeNode("Segoe Print");
//		font.add(segoe);
//		font.add(newRoman);
//		font.add(dejavu);
//		font.add(serif);
		JTree jt = new JTree(style);
		f.add(jt);
		jt.setBounds(50, 100, 200, 250);
		JScrollPane sp = new JScrollPane(jt1);
		f.add(sp);
		f.setTitle("JTree and JTable");
		f.setSize(400, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TableTree();
	}
}