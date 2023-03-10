package differentEventPackage;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Action extends JFrame  implements ActionListener{
	JLabel firstlbl,secondlbl,resultlbl;
	JTextField firsttxt,secondtxt,resulttxt;
	JButton add,subtract;
	
	public Action() {
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");
		
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		
		add = new JButton("Addition (+)");
		subtract = new JButton("Substraction (-)");
		
		setTitle("Action Event Handle Frame");
		setSize(400,200);
		
		setLayout(new GridLayout(4,2,5,5));
		
		add(firstlbl);
		add(firsttxt);
		
		add(secondlbl);
		add(secondtxt);
		
		add(add);
		add.addActionListener(this);
		
		add(subtract);
		subtract.addActionListener(this);
		
		add(resultlbl);
		add(resulttxt);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Action();
	}

	public void actionPerformed(ActionEvent e) {
		int first = Integer.parseInt(firsttxt.getText());//string to integer conversion
		int second = Integer.parseInt(secondtxt.getText());
		int result = 0;
		
		if(e.getActionCommand() == "Addition (+)") {
			result = first + second;
		}
		else {
			result = first - second;
		}
		resulttxt.setText(String.valueOf(result));
	}

}