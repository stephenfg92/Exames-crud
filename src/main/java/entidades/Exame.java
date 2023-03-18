package entidades;

public class Exame {
	String nome;
	String descricao;
	
	public Exame(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}

	public Exame setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getDescricao() {
		return descricao;
	}

	public Exame setDescricao(String descricao) {
		this.descricao = descricao;
		return this;
	}


}
