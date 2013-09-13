package exemplos;
import java.util.Date;

public class Cliente {
	private String nome;
	private String correio;
	private Date nascimento;

	public Cliente(String nome, String correio, Date nascimento) {
		super();
		this.nome = nome;
		this.correio = correio;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorreio() {
		return correio;
	}

	public void setCorreio(String correio) {
		this.correio = correio;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return String.format("Cliente [nome=%s, correio=%s, nascimento=%s]",
				nome, correio, nascimento);
	}

}
