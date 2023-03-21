package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.PacientesDao;
import entidades.Paciente;

public class PacienteObter extends ActionSupport{
	private int idPaciente;
	private Paciente paciente;
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	@Override
	public String execute() {
		PacientesDao pDao = new PacientesDao();
		paciente = pDao.getPaciente(idPaciente);
		return SUCCESS;
	}

}
