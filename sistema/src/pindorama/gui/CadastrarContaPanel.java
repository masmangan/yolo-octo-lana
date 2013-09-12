package pindorama.gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastrarContaPanel extends JPanel {
	private JLabel label;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;
	
//	private Conta conta;
//	
//	public Conta getConta() {
//		return new Conta(textField.getText());
//	}
	
	public CadastrarContaPanel() {
		// Add the ubiquitous "Hello World" label.
		label = new JLabel("Hello World");
		setLayout(new FlowLayout());

		add(label);

		textField = new JTextField("fill your name here");
		add(textField);

		//JButton button = new JButton(new JHelloAction(this));
//		button.setToolTipText("Aperte este botão");
//		button.setMnemonic(KeyEvent.VK_N);
//		add(button);
	}

}
