package pindorama.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class JHelloAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JHelloAction() {
		super();
		putValue(SHORT_DESCRIPTION, "curta");
		putValue(LONG_DESCRIPTION, "descrição longa");
		putValue(NAME, "nome");
		java.net.URL imageURL = JHelloAction.class.getResource("left.gif");
		putValue(SMALL_ICON, new ImageIcon(imageURL));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Apertaram!");
	}
}
