package dialoguePackage;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;

public class MultipleDesktopInterface extends JFrame
{
	JDesktopPane pane;
	JInternalFrame frame1, frame2, frame3, frame4;
	public MultipleDesktopInterface()
	{
		pane = new JDesktopPane();
		setTitle("Multiple Frame");
		setSize(500,500);
		frame1 = new JInternalFrame("First in Frame", true, true, true, true);
		// true --> Resizable, Closable, Maximizable, Minimizable-Inconifiabel
		
		frame1.setSize(200, 200);;
		frame1.setLocation(50, 20); // Desktop Pane above position
		pane.add(frame1);
		frame1.setVisible(true);
		
		frame2 = new JInternalFrame("Second in Frame", true, true, true, true);
		frame2.setSize(200, 200);;
		frame2.setLocation(260, 20); // Desktop Pane above position
		pane.add(frame2);
		frame2.setVisible(true);
		
		frame3 = new JInternalFrame("Third in Frame", true, true, true, true);
		frame3.setSize(200, 200);;
		frame3.setLocation(50, 230); // Desktop Pane above position
		pane.add(frame3);
		frame3.setVisible(true);
		
		frame4 = new JInternalFrame("Fourth in Frame", true, true, true, true);
		frame4.setSize(200, 200);;
		frame4.setLocation(260, 230); // Desktop Pane above position
		pane.add(frame4);
		frame4.setVisible(true);
		
		add(pane);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		new MultipleDesktopInterface();
	}

}
