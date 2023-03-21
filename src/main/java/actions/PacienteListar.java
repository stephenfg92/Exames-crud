package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Paciente;
import dao.PacientesDao;

public class PacienteListar extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Paciente> pacientes;
	
	public ArrayList<Paciente> getPacientes(){
		return pacientes;
	}
	
	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	@Override
	public String execute() {
		PacientesDao pDao = new PacientesDao();
		pacientes = pDao.listar();
		return SUCCESS;
	}

}
