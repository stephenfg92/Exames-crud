package main;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.ExamesDao;
import dao.ObservacoesDao;
import dao.PacientesDao;
import dao.ResultadosDao;
import entidades.Exame;
import entidades.Observacao;
import entidades.Paciente;
import entidades.Resultado;

public class Main {

	public static void main(String[] args) throws SQLException {
		// Paciente
		PacientesDao pDao = new PacientesDao();		
		Integer idPaciente = pDao.inserir(new Paciente("Ecóico"));
		Paciente p = pDao.getPaciente(idPaciente);
		
		ArrayList<Paciente> ps = pDao.listar();
		
		
		// Exame
		ExamesDao eDao = new ExamesDao();
		Integer idExame = eDao.inserir(new Exame("Echo", "Echo desc"));
		Exame e = eDao.getExame(idExame);
		
		ArrayList<Exame> es = eDao.listar();
		
		// Resultado
		ResultadosDao rDao = new ResultadosDao();
		Integer idResultado = rDao.inserir(new Resultado(e.getIdExame(), "01/01/1990", "resultado do exame echo"));
		Resultado r = rDao.getResultado(idResultado);
		
		ArrayList<Resultado> rs = rDao.listar();
		
		
		// Observacoes
		ObservacoesDao oDao = new ObservacoesDao();
		Integer idObservacao = oDao.inserir(new Observacao(r.getIdResultado(), "Tá condenado."));
		Observacao o = oDao.getObservacao(idObservacao);
		
		ArrayList<Observacao> os = oDao.listar();
		
		
		System.out.println("FIM");
	}

}
