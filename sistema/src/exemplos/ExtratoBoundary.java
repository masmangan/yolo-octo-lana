package exemplos;
import javax.swing.JOptionPane;


public class ExtratoBoundary {
	private ConsultarExtratoControl control;
	
	public ExtratoBoundary(ConsultarExtratoControl control) {
		this.control = control;
	}

	public void mostrarTelaCartao() {
		JOptionPane.showMessageDialog(null, "Insira cartão");
	}
	
	public void inserirDadosCartao(String dados) {
		control.inserirDadosCartao(dados);
	}
}
