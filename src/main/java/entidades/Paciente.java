package entidades;

public class Paciente {
	Integer idPaciente;
	String nome;
	
	public Paciente() {
		this.idPaciente = null;
		this.nome = null;
	}
	
	public Paciente(String nome) {
		this.idPaciente = null;
		this.nome = nome;
	}
	
	public Paciente(Integer idPaciente, String nome) {
		this.idPaciente = idPaciente;
		this.nome = nome;
	}

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
