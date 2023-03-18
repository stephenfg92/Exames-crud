package entidades;

public class Resultado {
	Integer idResultado;
	Integer idExame;
	String data;
	String resultado;
	
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

	public Integer getIdResultado() {
		return idResultado;
	}

	public Resultado setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
		return this;
	}

	public int getIdExame() {
		return idExame;
	}

	public Resultado setIdExame(Integer idExame) {
		this.idExame = idExame;
		return this;
	}

	public String getData() {
		return data;
	}

	public Resultado setData(String data) {
		this.data = data;
		return this;
	}

	public String getResultado() {
		return resultado;
	}

	public Resultado setResultado(String resultado) {
		this.resultado = resultado;
		return this;
	}
}
