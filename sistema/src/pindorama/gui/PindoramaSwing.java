package pindorama.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import pindorama.gui.action.SairAction;
import pindorama.gui.action.SobreAction;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class PindoramaSwing {
	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Banco Pindorama - Caixa Eletrônico");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();
		frame.setJMenuBar(mb);
		
		JMenu arquivo = new JMenu("Arquivo");
		mb.add(arquivo);
		JMenu ajuda = new JMenu("Ajuda");
		mb.add(ajuda);
		
		JMenuItem sair = new JMenuItem(new SairAction());
		arquivo.add(sair);
		JMenuItem sobre = new JMenuItem(new SobreAction(frame));
		ajuda.add(sobre);
		
		JPanel panel = new CadastrarContaPanel();

		frame.getContentPane().add(panel);

		// frame.setPreferredSize(new Dimension(800,200));
		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
