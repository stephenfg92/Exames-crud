package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import dao.PacientesDao;
import entidades.Paciente;

public class PacienteEditar extends ActionSupport {
	
	private int idPaciente;
	private String nomePaciente;
	private ArrayList<Paciente> pacientes;
	
	
	public int getIdPaciente() {
		return idPaciente;
	}


	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}


	public String getNomePaciente() {
		return nomePaciente;
	}


	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}


	@Override
	public String execute() {
		PacientesDao pDao = new PacientesDao();
		Paciente p = new Paciente(idPaciente, nomePaciente);
		boolean sucesso = pDao.editar(p);
		if (sucesso) {
			pacientes = pDao.listar();
			return SUCCESS;
		}
		
		return ERROR;
	}
}
