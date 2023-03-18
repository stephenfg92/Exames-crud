package entidades;

public class Exame {
	Integer idExame;

	String nome;
	String descricao;
	
	public Exame(String nome, String descricao) {
		this.idExame = null;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Exame(Integer idExame, String nome, String descricao) {
		this.idExame = idExame;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Integer getIdExame() {
		return idExame;
	}

	public Exame setIdExame(Integer idExame) {
		this.idExame = idExame;
		return this;
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
