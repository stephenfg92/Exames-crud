package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Paciente;
import entidades.Resultado;

public class ResultadosDao extends Dao{
	public Integer inserir(Resultado r) {
		String sql = "INSERT INTO Resultados (IdExame, IdPaciente, Data, Resultado) VALUES (?, ?, ?, ?);";
		Integer idResultado = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, r.getIdExame());
			stmt.setInt(2, r.getIdPaciente());
			stmt.setString(3, r.getData());
			stmt.setString(4, r.getResultado());
			
			stmt.executeUpdate();			
			
			rs = stmt.getGeneratedKeys();
			idResultado = rs.getInt("last_insert_rowid()");
			
		} catch (SQLException e) {
			System.out.println("Inserção de Resultado falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return idResultado;		
	}
	
	
	
	public ArrayList<Resultado> listar() {
		String sql = 
				"SELECT r.IdResultado, p.IdPaciente, p.Nome AS NomePaciente, r.Data, r.IdExame, e.Nome AS NomeExame, r.Resultado  "
				+ "FROM Resultados AS r  "
				+ "JOIN Pacientes AS p  "
				+ "ON r.IdPaciente = p.IdPaciente  "
				+ "JOIN Exames AS e  "
				+ "ON r.IdExame = e.IdExame "
				+ "ORDER BY NomePaciente ASC, NomeExame ASC; ";
		
		ArrayList<Resultado> resultados = new ArrayList<Resultado>();
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
                int idResultado = rs.getInt("IdResultado");
                int idExame = rs.getInt("IdExame");
                int idPaciente = rs.getInt("IdPaciente");
                String nomeExame =  rs.getString("NomeExame");
                String nomePaciente = rs.getString("NomePaciente");
                String data = rs.getString("Data");
                String resultado = rs.getString("Resultado");		
                
                Resultado r = new Resultado(idResultado, idExame, idPaciente, nomeExame, nomePaciente, data, resultado);
                resultados.add(r);				
			}
			
		} catch (Exception e) {
			System.out.println("Listagem de Resultados falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return resultados;		
	}
	
	public boolean editar(Resultado r) {
		String sql = "UPDATE Resultados SET Data = ?, Resultado = ? WHERE IdResultado = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, r.getData());
			stmt.setString(2, r.getResultado());
			stmt.setInt(3, r.getIdResultado());
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Edição de resultado falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}
	
	public boolean excluir(int idResultado) {
		String sql = "DELETE FROM Resultados WHERE IdResultado = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idResultado);
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Exclusão de resultado falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}
	
	
	public Resultado getResultado(Integer idResultado) {
		String sql = "SELECT r.IdResultado, p.IdPaciente, p.Nome AS NomePaciente, r.Data, r.IdExame, e.Nome AS NomeExame, r.Resultado  "
				+ "FROM Resultados AS r  "
				+ "JOIN Pacientes AS p  "
				+ "ON r.IdPaciente = p.IdPaciente  "
				+ "JOIN Exames AS e  "
				+ "ON r.IdExame = e.IdExame "
				+ "WHERE IdResultado = ?";
		
		Resultado r = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idResultado);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
                int idExame = rs.getInt("IdExame");
                int idPaciente = rs.getInt("IdPaciente");
                String nomeExame =  rs.getString("NomeExame");
                String nomePaciente = rs.getString("NomePaciente");
                String data = rs.getString("Data");
                String resultado = rs.getString("Resultado");		
				
				r = new Resultado(idResultado, idExame, idPaciente, nomeExame, nomePaciente, data, resultado);
			}
			
			assert(r.getIdResultado().equals(idResultado));			
			
		} catch (Exception e) {
			System.out.println("Aquisição de Resultado falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return r;
	}

}
