package differentEventPackage;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEventDemo extends JFrame
{
	public  WindowEventDemo()
	{
		setTitle("Mouse Event Frame");
		setSize(400, 400);
		
		addWindowListener(new WindowAdapter() {			
			public void windowOpened(WindowEvent e) 
			{
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Welcome");
			}
			
			public void windowIconified(WindowEvent e) 
			{
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Iconified..! BYE BYE ");
			}
			
			public void windowDeiconified(WindowEvent e) 
			{
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Deiconified..! Welcome BACK ");
			}
			
			public void windowDeactivated(WindowEvent e) 
			{
				System.out.println("Window is Deactivated...😁😁");
			}
			
			public void windowClosing(WindowEvent e) 
			{
				JOptionPane.showMessageDialog(WindowEventDemo.this, "Do you really want to exit ??? ");
			}
			
			public void windowClosed(WindowEvent e) 
			{
//				JOptionPane.showMessageDialog(WindowEventDemo.this, "Window is closed. BYE BYE");
				System.out.println("Window is closed .. BYE BYE.");
				super.windowClosed(e);
				System.out.println(e.getID() + "closed " + e.getNewState());
			}
			
			public void windowActivated(WindowEvent e) 
			{
				System.out.println("Window is Activated...❤❤");
			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new WindowEventDemo();
	}

}
