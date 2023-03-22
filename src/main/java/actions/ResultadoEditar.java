package actions;

import java.util.ArrayList;
import com.opensymphony.xwork2.ActionSupport;

import dao.ResultadosDao;
import entidades.Resultado;

public class ResultadoEditar extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int IdResultado;
	private String Data;
	private String Resultado;
	private ArrayList<Resultado> resultados;
	
	public int getIdResultado() {
		return IdResultado;
	}
	public void setIdResultado(int idResultado) {
		IdResultado = idResultado;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	public ArrayList<Resultado> getResultados() {
		return resultados;
	}
	public void setResultados(ArrayList<Resultado> resultados) {
		this.resultados = resultados;
	}
	

	@Override
	public String execute() {
		ResultadosDao rDao = new ResultadosDao();
		Resultado r = new Resultado(IdResultado, Data, Resultado);
		boolean sucesso = rDao.editar(r);
		
		if (sucesso) {
			resultados = rDao.listar();
			return SUCCESS;
		}
		
		return ERROR;
	}
}
