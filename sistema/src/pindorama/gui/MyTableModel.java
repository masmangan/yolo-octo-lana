package pindorama.gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import pindorama.dao.PindoramaDAO;
import pindorama.pojo.Conta;
import pindorama.pojo.Movimentacao;

public class MyTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Movimentacao> mvs;

	public MyTableModel(Conta c) {
		PindoramaDAO dao = new PindoramaDAO();
		mvs = dao.findMovimentacaoByConta(c);
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return mvs.size();
	}

	@Override
	public Object getValueAt(int lin, int col) {
		Movimentacao m = mvs.get(lin);
		switch (col) {
		case 0:
			return m.getData();
		case 1:
			return m.getDescricao();
		case 2:
			return m.getValor();
		default:
			return "*ERRO*";
		}
	}
}
