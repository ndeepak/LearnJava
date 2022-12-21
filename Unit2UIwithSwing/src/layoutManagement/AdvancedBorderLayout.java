package layoutManagement;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdvancedBorderLayout extends JFrame implements ActionListener
{
	private JButton buttons[];
	private static final String[] names = {"Hide North", "Hide South", "Hide West","Hide East", "Hide Center"};
	private AdvancedBorderLayout layout;
	
	public AdvancedBorderLayout()
	{
		super("Advanced border Layout frame");
		layout = new AdvancedBorderLayout(5,5);
		setLayout(layout);
		buttons = new JButton[names.length];
		
		for(int count=0; count<names.length; count++)
		{
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
		}
		add(buttons[0],BorderLayout.NORTH);
		add(buttons[1],BorderLayout.SOUTH);
		add(buttons[2],BorderLayout.EAST);
		add(buttons[3],BorderLayout.WEST);
		add(buttons[4],BorderLayout.CENTER);

	}
	
public void actionPerformed(ActionEvent event) 
{
	for(JButton button:buttons){//enhanced for loop[for each added buttons in a frame]
		if(event.getSource()==button){//if the clicked portion is button
		button.setVisible(false);//hide clicked buttons
		}
		else{
		button.setVisible(true);//show other buttons
		}
		}
		}
}

	public static void main(String[] args) 
	{
		public void actionPerformed(ActionEvent event) {
			for(JButton button:buttons){//enhanced for loop[for each added buttons in a frame]
			if(event.getSource()==button){//if the clicked portion is button
			button.setVisible(false);//hide clicked buttons
			}
			else{
			button.setVisible(true);//show other buttons
			}
			}
			15
			}
			}

	}

}
