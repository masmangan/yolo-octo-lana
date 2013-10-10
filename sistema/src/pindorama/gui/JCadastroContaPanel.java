package pindorama.gui;

import javax.swing.JPanel;
import javax.swing.JTable;

public class JCadastroContaPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public JCadastroContaPanel() {
		
		table = new JTable(new MyTableModel(null));
		add(table);

	}

}
