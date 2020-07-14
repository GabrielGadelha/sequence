package br.edu.ufersa.gabriel.model.DAO;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseDAO<VO>{
	private static Connection conn = null;
	private static final String url = "jdbc:mariadb://localhost:3306/sequence";
	private static final String user = "poo_20203";
	private static final String senha="melhormateria";
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(url,user,senha);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
		}
		else return conn;
	}
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	public abstract void inserir(VO vo) throws SQLException;
	public abstract void deletar(VO vo);
	public abstract void atualizar(VO vo);
	public abstract ResultSet listar();
	public abstract ResultSet listarPorId(VO vo);
	
}
