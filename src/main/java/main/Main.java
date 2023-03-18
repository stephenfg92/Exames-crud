package main;

import java.sql.SQLException;

import dao.PacientesDao;
import entidades.Paciente;

public class Main {

	public static void main(String[] args) throws SQLException {
		PacientesDao pDao = new PacientesDao();
		
		Integer idPaciente = pDao.inserir(new Paciente("James"));
		
		Paciente p = pDao.getPaciente(idPaciente);
		
		System.out.println("FIM");
	}

}
