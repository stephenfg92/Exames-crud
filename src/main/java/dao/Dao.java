package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	private String stringConexao;
	Connection conexao;
	PreparedStatement stmt;
	ResultSet rs;
	String msg;
	
	public Dao() {
		stringConexao = "jdbc:sqlite:db/exames.db";
	}
	
	public Connection conectar() throws SQLException {
		try {
			conexao = DriverManager.getConnection(stringConexao);
			System.out.println("Conexão bem sucedida!");		
		} catch(SQLException e) {
			System.out.println("A conexão com o banco falhou: " + e.getMessage());	
			e.printStackTrace();
		}
		return conexao;
	}
	
	public void desconectar(){
		System.out.println("Encerrando conexão com o banco...");
		try {
			if (stmt != null) stmt.close();
			if (rs != null) rs.close();
			conexao.close();
			System.out.println("Conexão encerrada!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
