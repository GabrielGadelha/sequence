package br.edu.ufersa.gabriel.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public class UsuarioDAO<VO extends UsuarioVO> extends PessoaDAO<VO>{
	@Override
	public void inserir(VO vo) {
		try {
			super.inserir(vo);
			String sql = "insert into Usuario (login, senha, id_pessoa) values (?,?,?)";
			PreparedStatement ptst;
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setString(1, vo.getLogin());
			ptst.setString(2, vo.getSenha());
			ptst.setLong(3, vo.getIdPessoa());
			int affectedRows = ptst.executeUpdate();
	        if (affectedRows == 0) {
	        	throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
		    }
		    ResultSet generatedKeys = ptst.getGeneratedKeys();
		    if (generatedKeys.next()) {
		         vo.setIdUsu(generatedKeys.getLong(1));
		    }
		    else {
		       throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
		    }
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet listarPorId(VO vo) {
		String sql = "select * from Pessoa where id=?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, 2);
			rs = ptst.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
