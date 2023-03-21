package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Paciente;
import dao.PacientesDao;

public class PacienteExcluir extends ActionSupport{
	private int idPaciente;
	private ArrayList<Paciente> pacientes;
	
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
