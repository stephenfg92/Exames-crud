package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Paciente;
import dao.PacientesDao;

public class PacienteExcluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idPaciente;
	private ArrayList<Paciente> pacientes;
	private Paciente paciente;
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
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
		boolean resultado = pDao.excluir(idPaciente);
		if (resultado){
			pacientes = pDao.listar();
			return SUCCESS;
		}
		return ERROR;
	}
	
}
