package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.PacientesDao;
import entidades.Paciente;

//https://www.devdoc.net/javaweb/struts/Struts2_2.3.24_index/manual/crud-demo-i.html

public class PacientesAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private PacientesDao pDao;
	
	Paciente p;
	
	public String execute() {
		pDao = new PacientesDao();
		
		return SUCCESS;
	}
	
	public PacientesDao getPacientesDao() {
		return pDao;
	}
	
	public void setPacienteNome(String pacienteNome) {
		p = new Paciente(pacienteNome);
	}
}
