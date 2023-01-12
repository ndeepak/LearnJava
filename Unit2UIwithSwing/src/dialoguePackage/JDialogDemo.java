package dialoguePackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class DialogBox extends JDialog
{
	public void DialogBox(JFrame parent)
	{
		super(parent, "Dialog title", true); // true disable other window
	}
}
public class JDialogDemo extends JFrame
{
	JButton click;
	public JDialogDemo()
	{
		
		setTitle("JDialog Frame");
		setSize(300, 300);
		click = new JButton("Display Dialog");
		click.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				new DialogBox(JDialogDemo.this);
			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) 
	{
		new JDialogDemo();
	}

}
