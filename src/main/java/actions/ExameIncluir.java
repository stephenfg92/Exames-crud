package actions;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Exame;
import dao.ExamesDao;

public class ExameIncluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Exame exame;
	
	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public String execute() {
		if (exame == null)
			return INPUT;
		
		ExamesDao eDao = new ExamesDao();
		eDao.inserir(exame);
		
		return SUCCESS;
	}
}
