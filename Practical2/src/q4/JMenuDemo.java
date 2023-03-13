package q4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JMenuDemo extends JFrame
{
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem save, open, exit;
	JCheckBoxMenuItem status;
	
	public JMenuDemo() 
	{
		bar = new JMenuBar();
		file = new JMenu("File");
		file.setMnemonic('F'); // ALt + F
		edit = new JMenu("EDIT");
		edit.setMnemonic('E'); // Alt + E
		view = new JMenu("VIEW");
		view.setMnemonic('V'); // Alt + V
		save = new JMenuItem("Save");
		open = new JMenuItem("Open");
		exit = new JMenuItem("Exit", KeyEvent.VK_X);
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		exit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		
		status = new JCheckBoxMenuItem("Status");
		status.setSelected(true);
		
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		
		file.add(save);
		file.add(open);
		
		edit.add(exit);
		view.add(status);
		
		setJMenuBar(bar); // It place/attaches the JMenuBar in JFrame
		setTitle("Menu Frame !!!");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) 
	{
		new JMenuDemo();
	}

}
