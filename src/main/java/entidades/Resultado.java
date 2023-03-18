package entidades;

public class Resultado {
	int idExame;
	String data;
	String resultado;
	
	public Resultado(int idExame, String data, String resultado) {
		this.idExame = idExame;
		this.data = data;
		this.resultado = resultado;
	}

	public int getIdExame() {
		return idExame;
	}

	public Resultado setIdExame(int idExame) {
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
