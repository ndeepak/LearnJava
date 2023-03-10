package quesTen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBoxExample1 {
	JFrame f;

	ComboBoxExample1() {
		f = new JFrame("ComboBox Example");
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		JButton b = new JButton("Select");
		b.setBounds(200, 100, 75, 20);
		String city[] = { "Kathmandu", "Lalitpur", "Bhaktapur", "Janakpur", "Birgunj" };
		JComboBox cb = new JComboBox(city);
		cb.setBounds(50, 100, 90, 20);
		f.add(cb);
		f.add(label);
		f.add(b);
		f.setLayout(null);
		f.setSize(400, 300);
		f.setVisible(true);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String data = "Your Best City Selected is: " + cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
			}
		});
	}

	public static void main(String[] args) {
		new ComboBoxExample1();
	}
}