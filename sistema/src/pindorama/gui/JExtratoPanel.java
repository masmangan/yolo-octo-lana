package pindorama.gui;

import javax.swing.JPanel;
import javax.swing.JTable;

import pindorama.pojo.Conta;

public class JExtratoPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public JExtratoPanel() {

		// table = new JTable();
		table = new JTable(new MyTableModel(new Conta(1, "", "", "")));

		add(table);

	}

}
