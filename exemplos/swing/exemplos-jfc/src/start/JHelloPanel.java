package start;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JHelloPanel extends JPanel {
	private JLabel label;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JHelloPanel() {
		// Add the ubiquitous "Hello World" label.
		 label = new JLabel("Hello World");
		setLayout(new FlowLayout());

		add(label);

		JTextField textField = new JTextField("fill your name here");
		add(textField);

		JButton button = new JButton(new JHelloAction());
		add(button);
	}

}
