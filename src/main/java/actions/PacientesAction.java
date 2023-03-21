package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.PacientesDao;

public class PacientesAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private PacientesDao pDao;
	
	public String execute() {
		pDao = new PacientesDao();
		
		return SUCCESS;
	}
	
	public PacientesDao getPacientesDao() {
		return pDao;
	}
}
