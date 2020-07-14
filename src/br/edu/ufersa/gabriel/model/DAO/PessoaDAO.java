package br.edu.ufersa.gabriel.model.DAO;

import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;

public class PessoaDAO<VO extends PessoaVO> extends BaseDAO<VO>{
	@Override
	public void inserir(VO vo) throws SQLException {
		String sql = "insert into Pessoa (nome,cpf,email,telefone) values (?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setString(1, vo.getNome());
			ptst.setString(2, vo.getCpf());
			ptst.setString(3, vo.getEmail());
			ptst.setString(4, vo.getTelefone());
			
	        int affectedRows = ptst.executeUpdate();

	        if (affectedRows == 0) {
	            throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
	        }
	        ResultSet generatedKeys = ptst.getGeneratedKeys();
	        if (generatedKeys.next()) {
	            vo.setIdPessoa(generatedKeys.getLong(1));
	        }
	        else {
	           throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
	        }
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void deletar(VO vo) {
		String sql = "delete from Pessoa where cpf = ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getCpf());
			ptst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void atualizar(VO vo) {
		String sql = "update Pessoa set nome = ? where id= ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getNome());
			ptst.setLong(2, vo.getIdPessoa());
			ptst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet listar() {
		String sql = "select * from Pessoa";
		Statement st;
		ResultSet rs = null;
				
 		try {
			st = getConnection().createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet listar2() {
		String sql = "select * from Pessoa";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			//ptst.setInt(1,2);
			System.out.println(ptst);
			rs = ptst.executeQuery(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		return rs;
	}
	
	@Override
	public ResultSet listarPorId(VO vo) {
		String sql = "select * from Pessoa where id=?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setLong(1,vo.getIdPessoa());
			System.out.println(ptst);
			rs = ptst.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet listarPorCPF(VO vo) {
		String sql = "select * from Pessoa where cpf = ?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getCpf());
			rs = ptst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
