package q1;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
	JFrame f;

	TreeExample() {
		f = new JFrame();
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
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
		DefaultMutableTreeNode newRoman = new DefaultMutableTreeNode("New Roman Times");
		DefaultMutableTreeNode serif = new DefaultMutableTreeNode("Liberation Serif");
		DefaultMutableTreeNode dejavu = new DefaultMutableTreeNode("Dejavu Sans");
		DefaultMutableTreeNode segoe = new DefaultMutableTreeNode("Segoe Print");
		font.add(segoe);
		font.add(newRoman);
		font.add(dejavu);
		font.add(serif);
		JTree jt = new JTree(style);
		f.add(jt);
		f.setSize(250, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TreeExample();
	}
}