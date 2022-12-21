package layoutManagement;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout extends JFrame
{
	JButton btn1, btn2, btn3, btn4;
	public FlowLayout()
	{
		super("FlowLayout Frame"); // Calls Constructor of JFrame
//		FlowLayout layout = new FlowLayout();
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10 ));  // LEFT Alignment 
		// FlowLayout(int align, int hgap, int vgap) 
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		setSize(300, 300);
		add(btn1); add(btn2); add(btn3); add(btn4);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new FlowLayout();
	}

}
