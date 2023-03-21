package actions;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Paciente;
import dao.PacientesDao;

public class PacienteIncluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static PacientesDao pDao = new PacientesDao();
	private Paciente paciente;
	
	public String execute() {
		if (paciente == null)
			return INPUT;
		
		pDao.inserir(paciente);
		
		return SUCCESS;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
