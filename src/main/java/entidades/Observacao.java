package entidades;

public class Observacao {
	int idResultado;
	String observacao;
	
	public Observacao(int idResultado, String observacao) {
		this.idResultado = idResultado;
		this.observacao = observacao;
	}

	public int getIdResultado() {
		return idResultado;
	}

	public Observacao setIdResultado(int idResultado) {
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
