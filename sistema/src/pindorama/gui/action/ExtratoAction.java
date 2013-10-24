package pindorama.gui.action;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

public class ExtratoAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private CardLayout card;

	public ExtratoAction(JFrame frame, CardLayout card) {
		super("Consultar extrato");
		this.frame = frame;
		this.card = card;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {	
		//TODO: criar tela extrato cliente
		card.show(frame.getContentPane(), "TelaExtratoCliente" );
	}
}
