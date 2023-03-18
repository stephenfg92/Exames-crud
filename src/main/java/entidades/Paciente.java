package entidades;

public class Paciente {
	Integer idPaciente;
	String nome;
	
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

	public Paciente setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Paciente setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	
}
