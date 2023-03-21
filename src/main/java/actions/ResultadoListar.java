package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Resultado;
import dao.ResultadosDao;

public class ResultadoListar extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Resultado> resultados;

	public ArrayList<Resultado> getResultados() {
		return resultados;
	}

	public void setResultados(ArrayList<Resultado> resultados) {
		this.resultados = resultados;
	}
	
	@Override
	public String execute() {
		ResultadosDao rDao = new ResultadosDao();
		resultados = rDao.listar();
		return SUCCESS;
	}

}
