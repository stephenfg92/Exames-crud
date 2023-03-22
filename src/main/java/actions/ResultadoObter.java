package actions;

import com.opensymphony.xwork2.ActionSupport;

import dao.ResultadosDao;
import entidades.Resultado;

public class ResultadoObter extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idResultado;
	private Resultado resultado;
	private boolean excluir;
	
	public int getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	public boolean isExcluir() {
		return excluir;
	}
	public void setExcluir(boolean excluir) {
		this.excluir = excluir;
	}
	
	@Override
	public String execute() {
		ResultadosDao rDao = new ResultadosDao();
		resultado = rDao.getResultado(idResultado);
		
		if (excluir)
			return INPUT;
		
		return SUCCESS;
	}
}
