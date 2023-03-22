package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import entidades.Exame;
import entidades.Paciente;
import entidades.Resultado;
import dao.ResultadosDao;

public class ResultadoIncluir extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private ArrayList<Paciente> pacientes;
	private ArrayList<Exame> exames;
	private String data;
	private String resultado;
	private Resultado resultadoObj;
	
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	public ArrayList<Exame> getExames() {
		return exames;
	}
	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Resultado getResultadoObj() {
		return resultadoObj;
	}
	public void setResultadoObj(Resultado resultadoObj) {
		this.resultadoObj = resultadoObj;
	}
	
	public String execute() {
		if (resultadoObj == null)
			return INPUT;
		
		ResultadosDao rDao = new ResultadosDao();
		Integer idResultado = rDao.inserir(resultadoObj);
		resultadoObj = rDao.getResultado(idResultado);
		
		return SUCCESS;
	}

}
