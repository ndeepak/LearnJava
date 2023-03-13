package q3;

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemo extends JFrame {

	JSlider slider;
	ChangeListener listener;
	JTextField valuetxt;

	public JSliderDemo() {
		setTitle("JSlider");
		setSize(300, 200);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		valuetxt = new JTextField(20);

		listener = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				valuetxt.setText(String.valueOf(source.getValue()));
			}
		};

//		slider = new JSlider();
//		slider = new JSlider(10,20,30);
//		slider = new JSlider(SwingConstants.VERTICAL, 10, 90, 30);
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 20);
		Hashtable<Integer, Component> labeltbl = new Hashtable<Integer, Component>();
		labeltbl.put(0, new JLabel("A"));
		labeltbl.put(20, new JLabel("B"));
		labeltbl.put(40, new JLabel("C"));
		labeltbl.put(60, new JLabel("D"));
		labeltbl.put(80, new JLabel("E"));
		labeltbl.put(100, new JLabel("F"));
		slider.setLabelTable(labeltbl);
		slider.setPaintTicks(true); // shows the major and minor ticks
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setInverted(false);
		slider.setPaintLabels(true);

		slider.setSnapToTicks(true); // moves/click to nearest tick(i.e. minor ticks)
		slider.addChangeListener(listener);
		add(slider);
		add(valuetxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JSliderDemo();
	}

}
