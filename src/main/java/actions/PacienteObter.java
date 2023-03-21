package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.PacientesDao;
import entidades.Paciente;

public class PacienteObter extends ActionSupport{
	private int idPaciente;
	private Paciente paciente;
	private boolean excluir;
	
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
	
	public boolean isExcluir() {
		return excluir;
	}
	public void setExcluir(boolean excluir) {
		this.excluir = excluir;
	}
	@Override
	public String execute() {
		PacientesDao pDao = new PacientesDao();
		paciente = pDao.getPaciente(idPaciente);
		
		if (excluir)
			return INPUT;
		
		return SUCCESS;
	}

}
