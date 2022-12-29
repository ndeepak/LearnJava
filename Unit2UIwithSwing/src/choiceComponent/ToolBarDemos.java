package choiceComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class ToolBarDemos extends JFrame implements Action
{
	JMenuBar bar;
	JMenu file, edit, view;
	JMenuItem save, open, exit;
	JCheckBoxMenuItem status;
	
	JPanel panel;
	
	public ToolBarDemos() 
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
		save.setEnabled(false);
		file.add(open);
		
		edit.add(exit);
		view.add(status);
		
		setJMenuBar(bar);
		setTitle("Toolbar Frame");
		setSize(300, 400);
		panel = new JPanel();
		add(panel);
		// Set actions
		Action runaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("run.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel.setBackground(Color.cyan);
			}
		};
		
		Action runaction1 = new AbstractAction("Run", new ImageIcon(getClass().getResource("close.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel.setBackground(Color.MAGENTA);
			}
		};
		
		Action openaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("open.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				panel.setBackground(Color.MAGENTA);
			}
		};
		
		Action closeaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("close.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		};
		
		Action folderaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("filechooser.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new JFileChooser().showOpenDialog(panel);
			}
		};
		
		Action coloraction = new AbstractAction("Run", new ImageIcon(getClass().getResource("filechooser.png"))) 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Color c = new JColorChooser().showDialog(panel, "Select Color-- ", Color.DARK_GRAY);
				panel.setBackground(c);
			}
		};
		
		
		setVisible(true);
		status.addActionListener(runaction);
		JToolBar bar = new JToolBar();
		open.addActionListener(folderaction);
		bar.add(runaction);
		bar.add(runaction1);
		bar.add(openaction);
		bar.add(closeaction);
		bar.add(folderaction);
		bar.add(coloraction);
		
		add(bar, BorderLayout.NORTH); //  bar added to JFrame in North
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new ToolBarDemos();
	}

}
