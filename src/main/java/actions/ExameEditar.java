package actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import entidades.Exame;
import dao.ExamesDao;

public class ExameEditar extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private int idExame;
	private String nome;
	private String descricao;
	private ArrayList<Exame> exames;
	
	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}

	@Override
	public String execute() {
		ExamesDao eDao = new ExamesDao();
		Exame ex = new Exame(idExame, nome, descricao);
		boolean sucesso = eDao.editar(ex);
		if (sucesso) {
			exames = eDao.listar();
			return SUCCESS;
		}
		
		return ERROR;
	}

}
