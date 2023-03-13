package q8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FocusEventDemo {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public FocusEventDemo() {
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("FocusEventDemo");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);

//		mainFrame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent windowEvent) {
//				System.exit(0);
//			}
//		});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showFocusAdapterDemo() {
		headerLabel.setText("Listener in action: FocusAdapter");
		JButton okButton = new JButton("OK");
		JButton cancelButton = new JButton("Cancel");

		okButton.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				statusLabel.setText(
						statusLabel.getText() + e.getComponent().getClass().getSimpleName() + " gained focus. ");
			}
		});
		cancelButton.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				statusLabel
						.setText(statusLabel.getText() + e.getComponent().getClass().getSimpleName() + " lost focus. ");
			}
		});
		controlPanel.add(okButton);
		controlPanel.add(cancelButton);
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		FocusEventDemo swingAdapterDemo = new FocusEventDemo();
		swingAdapterDemo.showFocusAdapterDemo();
	}
}