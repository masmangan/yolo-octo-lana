package pindorama.gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pindorama.pojo.Conta;

public class CadastrarContaPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField cpf;
	private JTextField nome;
	private JTextField numero;

	public Conta getConta() {
		return new Conta(cpf.getText(), nome.getText(), numero.getText());
	}

	public CadastrarContaPanel() {
		JLabel label;

		setLayout(new FlowLayout());

		label = new JLabel("CPF");
		add(label);
		cpf = new JTextField(10);
		add(cpf);

		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		add(nome);

		label = new JLabel("Numero");
		add(label);
		numero = new JTextField(10);
		add(numero);

		JButton button = new JButton(new CadastrarContaAction(this));
		button.setToolTipText("Cadastrar conta");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
	}

}
