package q8;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FocusListenerDemo extends JFrame implements FocusListener {
	private JTextField t1, t2, t3;
	JLabel l1, l2, l3;
	JButton b;
	JTextArea area;

	public FocusListenerDemo() {
		super("Handling Focus Event");
		l1 = new JLabel("First Value");
		t1 = new JTextField(10);
		l2 = new JLabel("Second Value");
		t2 = new JTextField(10);
		l3 = new JLabel("Result");
		t3 = new JTextField(10);
		b = new JButton("Multiply");
		area = new JTextArea();
//		area.setBounds(0,0,0,0);
		t1.addFocusListener(this);// intial focussed component
		t2.addFocusListener(this);// using tab for next focus
		b.addFocusListener(this);// using tab for focussing button
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		add(area);
		setSize(300, 300);
		setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) {
		int x, y, z;
		if (e.getSource() == b) {
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x * y;
			t3.setText(String.valueOf(z));
			area.setText("Focus Gained!!");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {// focus lost from the textbox when dialogbox popup
		if (e.getSource() == t1 && t1.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Empty textbox, Enter number to continue");
			t1.requestFocus();
		}
		if (e.getSource() == t2 && t2.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Empty textbox, Enter number to continue");
			t2.requestFocus();
		}
		area.setText("Focus Lost!!");
	}

	public static void main(String[] args) {
		new FocusListenerDemo();
	}
}