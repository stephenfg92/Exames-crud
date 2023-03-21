package entidades;

public class Resultado {
	Integer idResultado;
	Integer idExame;
	String nomeExame;
	String data;
	String resultado;
	
	public Resultado() {}
	
	public Resultado(Integer idExame, String data, String resultado) {
		this.idExame = idExame;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado, Integer idExame, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado, Integer idExame, String nomeExame, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.nomeExame = nomeExame;
		this.data = data;
		this.resultado = resultado;
	}

	public Integer getIdResultado() {
		return idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(Integer idExame) {
		this.idExame = idExame;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
