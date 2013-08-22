package pindorama.pojo;

public class Conta {

	private int contaId;
	private String cpfBD;
	private String nome;
	private String numero;

	public Conta(int contaId, String cpfBD, String nome, String numero) {
		super();
		this.contaId = contaId;
		this.cpfBD = cpfBD;
		this.nome = nome;
		this.numero = numero;
	}

	public int getContaId() {
		return contaId;
	}

	public String getCpfBD() {
		return cpfBD;
	}

	public String getNome() {
		return nome;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return String.format(
				"Conta [contaId=%s, cpfBD=%s, nome=%s, numero=%s]", contaId,
				cpfBD, nome, numero);
	}

}
