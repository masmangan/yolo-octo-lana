package pindorama.gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import pindorama.gui.JCadastrarContaPanel;
import pindorama.gui.JExtratoPanel;

public class ExtratoFecharAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private JExtratoPanel panel;

	/**
	 * 
	 * @param jExtratoPanel
	 */
	public ExtratoFecharAction(JExtratoPanel jExtratoPanel) {
		super("Fechar");
		this.panel = jExtratoPanel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//panel.clear();
		CardLayout card = panel.getCard();
		JFrame frame = panel.getFrame();
		card.show(frame.getContentPane(), "Vazio");		
	}

}
