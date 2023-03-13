package q4;

import javax.swing.*;

import java.awt.event.*;

public class MenuExample implements ActionListener {
	JFrame f;
	JMenuBar mb;
	JMenu file, edit, view, help;
	JMenuItem save, open, exit, cut, copy, paste, selectAll, about;
	JTextArea ta;
	JCheckBoxMenuItem status;

	MenuExample() {
		f = new JFrame();
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectAll = new JMenuItem("selectAll");
		exit = new JMenuItem("Exit", KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		about = new JMenuItem("About Us");

		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		about.addActionListener(this);

		mb = new JMenuBar();
		file = new JMenu("File");
		file.setMnemonic('F');
		edit = new JMenu("Edit");
		edit.setMnemonic('E');
		view = new JMenu("View");
		view.setMnemonic('V');
		help = new JMenu("Help");
		save = new JMenuItem("Save");
		open = new JMenuItem("Open");

		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		status = new JCheckBoxMenuItem("Status");
		status.setSelected(true);

		file.add(save);
		file.add(open);

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		edit.add(exit);

		view.add(status);
		help.add(about);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);

		ta = new JTextArea();
		ta.setBounds(5, 5, 360, 320);
		f.add(mb);
		f.add(ta);
		f.setJMenuBar(mb);
		f.setTitle("Menus in Swing");
		f.setLayout(null);
		f.setSize(400, 300);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cut)
			ta.cut();
		if (e.getSource() == paste)
			ta.paste();
		if (e.getSource() == copy)
			ta.copy();
		if (e.getSource() == selectAll)
			ta.selectAll();
		if (e.getSource() == about)
			ta.setText("HELLO WORLD FROM UP ABOVE THE SKY \n I am Deepak Nagarkoti, CSIT Student of TU."
					+ "\n I am involved in Networking & Security Job roles in multiple orgs."
					+ "\n Also I look up as a IT consultant in various orgs.");
	}

	public static void main(String[] args) {
		new MenuExample();
	}
}