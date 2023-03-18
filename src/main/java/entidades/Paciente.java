package entidades;

public class Paciente {
	private String nome;
	
	public Paciente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Paciente setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	
}
