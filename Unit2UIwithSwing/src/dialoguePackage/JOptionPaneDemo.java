package dialoguePackage;

import javax.swing.JOptionPane;

public class JOptionPaneDemo 
{
	int firstnum, secondnum;
	
	public JOptionPaneDemo()
	{
		firstnum = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number: "));
		secondnum = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number: "));
		int sum = firstnum + secondnum;
		JOptionPane.showMessageDialog(null, "The Sum is= "+sum, "The Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showConfirmDialog(null, "The sum is "+sum, "Summation", JOptionPane.OK_CANCEL_OPTION ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(null, "The Sum is "+sum,"Sumamtion", JOptionPane.ERROR_MESSAGE);
		int index = JOptionPane.showConfirmDialog(null, "The Sum is "+sum,"Sumamtion", JOptionPane.ERROR_MESSAGE);
		System.out.println(index);
		if(index == 0)
		{
			JOptionPane.showMessageDialog(null, "Proceed");
		}
		else if(index == 1)
		{
			JOptionPane.showMessageDialog(null, "Refused");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Cancelled");
		}
		
		
	}
	public static void main(String[] args) 
	{
		new JOptionPaneDemo();
	}

}
