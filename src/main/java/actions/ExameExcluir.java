package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Exame;
import dao.ExamesDao;

public class ExameExcluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idExame;
	private ArrayList<Exame> exames;
	private Exame exame;
	
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	@Override
	public String execute() {
		ExamesDao eDao = new ExamesDao();
		boolean resultado = eDao.excluir(idExame);
		if (resultado){
			exames = eDao.listar();
			return SUCCESS;
		}
		return ERROR;
	}
	
}
