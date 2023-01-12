package dialoguePackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class DialogBoxDemo extends JFrame {
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	private AboutDialog dialog;

	public DialogBoxDemo() 
	{
		setTitle("DialogTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);	
		// construct a button and panel
		JButton about = new JButton("About");
		JPanel btnpanel = new JPanel();
		this.add(btnpanel);
		about.setBounds(5, 5, 5, 5);

		btnpanel.add(about);
		about.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				if (dialog == null) // first time
					dialog = new AboutDialog(DialogBoxDemo.this);
				dialog.setVisible(true); // pop up dialog	
			}
		});
	}
}
public static void main(String[] args) 
{
	DialogBoxDemo frame = new DialogBoxDemo();
	frame.setVisible(true);
}
