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
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, p.getNomePaciente());
			
			stmt.executeUpdate();			
			
			rs = stmt.getGeneratedKeys();
			pacienteId = rs.getInt("last_insert_rowid()");
			
		} catch (SQLException e) {
			System.out.println("Inserção de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return pacienteId;		
	}
	
	public boolean editar(Paciente p) {
		String sql = "UPDATE Pacientes SET Nome = ? WHERE IdPaciente = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, p.getNomePaciente());
			stmt.setInt(2, p.getIdPaciente());
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Edição de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}
	
	public boolean excluir(int idPaciente) {
		String sql = "DELETE FROM Pacientes WHERE IdPaciente = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idPaciente);
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Exclusão de paciente falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}
	
	public ArrayList<Paciente> listar() {
		String sql = "SELECT * FROM Pacientes;";
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		try {
			conectar();
			stmt = conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Paciente p = new Paciente(rs.getInt("IdPaciente"), rs.getString("Nome"));
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
				p = new Paciente(rs.getInt("IdPaciente"), rs.getString("Nome"));
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
				p = new Paciente(rs.getInt("IdPaciente"), rs.getString("Nome"));
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
