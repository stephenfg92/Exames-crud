package entidades;

public class Exame {
	Integer idExame;

	String nome;
	String descricao;
	
	public Exame(){
		this.idExame = null;
		this.nome = null;
		this.descricao = null;
	}
	
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

	public void setIdExame(Integer idExame) {
		this.idExame = idExame;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
