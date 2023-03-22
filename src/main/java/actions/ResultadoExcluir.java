package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.ResultadosDao;
import entidades.Resultado;

public class ResultadoExcluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private int idResultado;
	private ArrayList<Resultado> resultados;
	private Resultado resultado;
	
	public int getIdResultado() {
		return idResultado;
	}
	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}
	public ArrayList<Resultado> getResultados() {
		return resultados;
	}
	public void setResultados(ArrayList<Resultado> resultados) {
		this.resultados = resultados;
	}
	public Resultado getResultado() {
		return resultado;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	@Override
	public String execute() {
		ResultadosDao rDao = new ResultadosDao();
		boolean sucesso = rDao.excluir(idResultado);
		if (sucesso){
			resultados = rDao.listar();
			return SUCCESS;
		}
		return ERROR;
	}
}
