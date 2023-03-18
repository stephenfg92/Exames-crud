package main;

import java.sql.SQLException;

import dao.Dao;

public class Main {

	public static void main(String[] args) throws SQLException {
		Dao dao = new Dao();
		dao.conectar();
		dao.desconectar();
	}

}
