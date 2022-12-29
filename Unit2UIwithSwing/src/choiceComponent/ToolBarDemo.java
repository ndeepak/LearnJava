package choiceComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame implements Action
{
	JPanel panel;
	
	public ToolBarDemo() 
	{
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
		JToolBar bar = new JToolBar();
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
		new ToolBarDemo();
	}

}
