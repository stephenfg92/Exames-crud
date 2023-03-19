package dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Observacao;

public class ObservacoesDao extends Dao{
	public Integer inserir(Observacao o) {
		String sql = "INSERT INTO Observacoes (IdResultado, Observacao) VALUES (?, ?);";
		Integer idObservacao = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setInt(1, o.getIdResultado());
			stmt.setString(2, o.getObservacao());
			
			stmt.executeUpdate();			
			
			rs = stmt.getGeneratedKeys();
			idObservacao = rs.getInt("last_insert_rowid()");
			
		} catch (SQLException e) {
			System.out.println("Inserção de observação falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return idObservacao;		
	}
	
	public ArrayList<Observacao> listar() {
		String sql = "SELECT * FROM Observacoes;";
		ArrayList<Observacao> observacoes = new ArrayList<Observacao>();
		
		try {
			conectar();
			stmt = conexao.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Observacao o = new Observacao(rs.getInt("IdObservacao"), rs.getInt("IdResultado"), rs.getString("Observacao"));
				observacoes.add(o);
			}
			
		} catch (Exception e) {
			System.out.println("Listagem de xs falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return observacoes;		
	}
	
	
	public Observacao getObservacao(Integer idObservacao) {
		String sql = "SELECT * From Observacoes where IdObservacao = ?;";
		Observacao o = null;
		
		try {
			conectar();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idObservacao);
			
			rs = stmt.executeQuery();
			while(rs.next()) {
				o = new Observacao(rs.getInt("IdObservacao"), rs.getInt("IdResultado"), rs.getString("Observacao"));
			}
			
			assert(o.getIdObservacao().equals(idObservacao));			
			
		} catch (Exception e) {
			System.out.println("Aquisição de x falhou: " + e);
			e.printStackTrace();
		} finally {
			desconectar();
		}
		
		return o;
	}
}
