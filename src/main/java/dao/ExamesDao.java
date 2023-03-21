package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Exame;
import entidades.Paciente;

public class ExamesDao extends Dao{
	public Integer inserir(Exame ex) {
		String sql = "INSERT INTO Exames (Nome, Descricao) VALUES (?, ?);";
		Integer idExame = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, ex.getNome());
			stmt.setString(2, ex.getDescricao());
			
			stmt.executeUpdate();			
			
			rs = stmt.getGeneratedKeys();
			idExame = rs.getInt("last_insert_rowid()");
			
		} catch (SQLException e) {
			System.out.println("Inserção de exame falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return idExame;		
	}
	
	public ArrayList<Exame> listar() {
		String sql = "SELECT * FROM Exames;";
		ArrayList<Exame> exames = new ArrayList<Exame>();
		
		try {
			conectar();
			stmt = conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Exame ex = new Exame(rs.getInt("IdExame"), rs.getString("Nome"), rs.getString("Descricao"));
				exames.add(ex);
			}
			
		} catch (Exception e) {
			System.out.println("Listagem de exames falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return exames;		
	}
	
	public boolean editar(Exame ex) {
		String sql = "UPDATE Exames SET Nome = ?, Descricao = ? WHERE IdExame = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, ex.getNome());
			stmt.setString(2, ex.getDescricao());
			stmt.setInt(2, ex.getIdExame());
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Edição de exame falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}
	
	public boolean excluir(int idExame) {
		String sql = "DELETE FROM Exames WHERE IdExame = ?;";
		boolean sucesso = false;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idExame);
			
			stmt.executeUpdate();
			
			sucesso = true;
			
		} catch (SQLException e) {
			System.out.println("Exclusão de exame falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return sucesso;		
	}

	
	public Exame getExame(Integer idExame) {
		String sql = "SELECT * From Exames where IdExame = ?;";
		Exame ex = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idExame);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				ex = new Exame(rs.getInt("IdExame"), rs.getString("Nome"), rs.getString("Descricao"));
			}
			
			assert(ex.getIdExame().equals(idExame));			
			
		} catch (Exception e) {
			System.out.println("Aquisição de x falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return ex;
	}

}
