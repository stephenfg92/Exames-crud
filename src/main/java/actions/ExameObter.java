package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.ExamesDao;
import entidades.Exame;

public class ExameObter extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idExame;
	private Exame exame;
	private boolean excluir;
	
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public boolean isExcluir() {
		return excluir;
	}

	public void setExcluir(boolean excluir) {
		this.excluir = excluir;
	}

	@Override
	public String execute() {
		ExamesDao eDao = new ExamesDao();
		exame = eDao.getExame(idExame);
		
		if (excluir)
			return INPUT;
		
		return SUCCESS;
	}

}
