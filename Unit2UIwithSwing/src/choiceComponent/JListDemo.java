package choiceComponent;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame
{
	JList<String> country;
	JLabel label;
	public JListDemo() 
	{
		setTitle("JList Frame");
		setSize(300, 300);
		setLayout(new FlowLayout());
		String[] coun = {"Nepal", "China", "India", "Bangladesh"};
		country = new JList<String>(coun);
		label = new JLabel("Selected Countries");
		country.addListSelectionListener(new ListSelectionListener() 
		{
			public void valueChanged(ListSelectionEvent e) 
			{
				label.setText(country.getSelectedValuesList().toString());
				JOptionPane.showMessageDialog(rootPane, e);
			}
		}
		);
		
		add(country);
		add(label);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new JListDemo();
	}

}
