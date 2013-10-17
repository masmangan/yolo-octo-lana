package pindorama.gui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
