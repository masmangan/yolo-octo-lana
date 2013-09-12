package pindorama.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pindorama.dao.PindoramaDAO;
import pindorama.pojo.Conta;

public class CadastrarContaAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CadastrarContaPanel panel;

	public CadastrarContaAction(CadastrarContaPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Conta c = panel.getConta();
		System.out.println(c);
		PindoramaDAO dao = new PindoramaDAO();
		dao.insertConta(c);
		
	}
}
