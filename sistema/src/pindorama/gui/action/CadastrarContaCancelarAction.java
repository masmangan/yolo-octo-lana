package pindorama.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pindorama.gui.CadastrarContaPanel;

public class CadastrarContaCancelarAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private CadastrarContaPanel panel;

	/**
	 * 
	 * @param panel
	 */
	public CadastrarContaCancelarAction(CadastrarContaPanel panel) {
		super("Cancelar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		panel.clear();
	}

}
