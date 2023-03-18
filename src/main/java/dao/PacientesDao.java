package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Paciente;

public class PacientesDao extends Dao{
	public Integer inserir(Paciente p) {
		String sql = "INSERT INTO Pacientes (nome) VALUES (?);";
		Integer pacienteId = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, p.getNome());
			
			int numLinhasCriadas = stmt.executeUpdate();
			
			if (numLinhasCriadas > 0) {
				rs = stmt.getGeneratedKeys();
				if(rs.next()) {
					pacienteId = rs.getInt(1);
				}
			}
			
		} catch (SQLException e) {
			System.out.println("Inserção de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return pacienteId;		
	}
	
	public ArrayList<Paciente> listar() {
		String sql = "SELECT * FROM Pacientes;";
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		try {
			conectar();
			stmt = conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Paciente p = new Paciente(rs.getString("nome"));
				pacientes.add(p);
			}
			
		} catch (Exception e) {
			System.out.println("Listagem de pacientes falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return pacientes;		
	}
	
	public Paciente getPaciente(String nome) {
		String sql = "SELECT * From Pacientes where nome = ?;";
		Paciente p = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				p = new Paciente(rs.getInt(1), rs.getString("nome"));
			}
			
			
		} catch (Exception e) {
			System.out.println("Aquisição de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return p;
	}
	
	public Paciente getPaciente(Integer idPaciente) {
		String sql = "SELECT * From Pacientes where idPaciente = ?;";
		Paciente p = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idPaciente);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				p = new Paciente(rs.getInt(1), rs.getString("nome"));
			}
			
			assert(p.getIdPaciente().equals(idPaciente));			
			
		} catch (Exception e) {
			System.out.println("Aquisição de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return p;
	}
	


}
