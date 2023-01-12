package dialoguePackage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class AboutDialog extends JDialog 
{
	public AboutDialog(JFrame owner) 
	{
		super(owner, "About DialogTest", true);// true disables other windows
		// add HTML label to center
		add(new JLabel("<html><h1><i>Core Java</i></h1><hr>By Cay Horstmann and Gary
				Cornell</html>"),BorderLayout.CENTER);
				// Ok button closes the dialog
		JButton ok = new JButton("Ok");
		ok.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event) 
			{
				setVisible(false);
			}
		});
		// add Ok button to southern border
		JPanel panel = new JPanel();
		panel.add(ok);
		add(panel, BorderLayout.SOUTH);
		setSize(250, 150);
	}
}