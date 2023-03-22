package entidades;

public class Resultado {
	Integer idResultado;
	Integer idExame;
	Integer idPaciente;
	String nomeExame;
	String nomePaciente;
	String data;
	String resultado;
	
	public Resultado() {}
	
	public Resultado(Integer idResultado, String data, String resultado) {
		this.idResultado = idResultado;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idExame, Integer idPaciente, String data, String resultado) {
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado,Integer idExame,  Integer idPaciente, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.data = data;
		this.resultado = resultado;
	}
	
	public Resultado(Integer idResultado, Integer idExame, Integer idPaciente, String nomeExame, String nomePaciente, String data, String resultado) {
		this.idResultado = idResultado;
		this.idExame = idExame;
		this.idPaciente = idPaciente;
		this.nomeExame = nomeExame;
		this.nomePaciente = nomePaciente;
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

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
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
