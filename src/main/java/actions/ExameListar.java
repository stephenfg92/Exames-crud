package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Exame;
import dao.ExamesDao;

public class ExameListar extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Exame> exames;
	
	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	@Override
	public String execute() {
		ExamesDao eDao = new ExamesDao();
		exames = eDao.listar();
		return SUCCESS;
	}

}
