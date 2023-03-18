package entidades;

public class Observacao {
	Integer idObservacao;
	Integer idResultado;
	String observacao;
	
	public Observacao(Integer idResultado, String observacao) {
		this.idObservacao = null;
		this.idResultado = idResultado;
		this.observacao = observacao;
	}
	
	public Observacao(Integer idObservacao, Integer idResultado, String observacao) {
		this.idObservacao = idObservacao;
		this.idResultado = idResultado;
		this.observacao = observacao;
	}

	public Integer getIdObservacao() {
		return idObservacao;
	}

	public Observacao setIdObservacao(Integer idObservacao) {
		this.idObservacao = idObservacao;
		return this;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public Observacao setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
		return this;
	}

	public String getObservacao() {
		return observacao;
	}

	public Observacao setObservacao(String observacao) {
		this.observacao = observacao;
		return this;
	}
}
