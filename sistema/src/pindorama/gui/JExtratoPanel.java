package pindorama.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import pindorama.pojo.Conta;

public class JExtratoPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable table;

	/**
	 * Create the panel.
	 * @param card 
	 * @param frame 
	 */
	public JExtratoPanel(JFrame frame, CardLayout card) {

		//TODO: rever parâmetros
		
		// table = new JTable();
		setLayout(new BorderLayout());
		table = new JTable(new MyTableModel(new Conta(1, "", "", "")));

		add(BorderLayout.CENTER, table);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new JExtratoPanel(null, null));

		frame.setPreferredSize(new Dimension(800, 200));
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
