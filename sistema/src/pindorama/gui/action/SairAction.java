package pindorama.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class SairAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SairAction() {
		super("Sair");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO: verificar dados antes de sair da aplicação 
		System.exit(0);
	}

}
