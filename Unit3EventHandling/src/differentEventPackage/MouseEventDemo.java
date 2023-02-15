package differentEventPackage;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame
{
	JLabel label;
	public MouseEventDemo()
	{
		setTitle("Mouse Event Frame");
		setSize(400, 400);
		label = new JLabel();
		
		add(label, BorderLayout.SOUTH);
		addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) 
			{
				int x = e.getX();
				int y = e.getY();
				label.setText("Released at: " +x + ", " + y);
			}
			
			public void mousePressed(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Pressed at: " +x + ", " + y);
			}
			
			public void mouseExited(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Exited at: " +x + ", " + y);
			}
			
			public void mouseEntered(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Entered at: " +x + ", " + y);
			}
			
			public void mouseClicked(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Entered at: " +x + ", " + y);
			}
		});
		
		addMouseListener(new MouseAdapter() {	// gives permisson to remove any method use(specific)		
			public void mouseReleased(MouseEvent e) 
			{
				int x = e.getX();
				int y = e.getY();
				label.setText("Released at: " +x + ", " + y);
			}
			
			public void mousePressed(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Pressed at: " +x + ", " + y);
			}
			
			public void mouseExited(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Exited at: " +x + ", " + y);
			}
			
			public void mouseEntered(MouseEvent e) 
			{
				int x=e.getX();
				int y = e.getY();
				label.setText("Entered at: " +x + ", " + y);
			}
			
//			public void mouseClicked(MouseEvent e) 
//			{
//				int x=e.getX();
//				int y = e.getY();
//				label.setText("Entered at: " +x + ", " + y);
//			}
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new MouseEventDemo();
	}

}
