package br.edu.ufersa.gabriel.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;


public class ResponsavelDAO extends UsuarioDAO<ResponsavelVO>{
	@Override
	public void inserir(ResponsavelVO vo) {
		try {
			super.inserir(vo);
			String sql = "insert into Responsavel (departamento, id_usuario, id_pessoa) values (?,?,?)";
			PreparedStatement ptst;
			ptst = getConnection().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ptst.setString(1, vo.getDepartamento());
			ptst.setLong(2, vo.getIdUsu());
			ptst.setLong(3, vo.getIdPessoa());
			int affectedRows = ptst.executeUpdate();
	        if (affectedRows == 0) {
	        	throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
		    }
		    ResultSet generatedKeys = ptst.getGeneratedKeys();
		    if (generatedKeys.next()) {
		         vo.setId(generatedKeys.getLong(1));
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
	public ResultSet listarPorId(ResponsavelVO vo) {
		String sql = "select * from Pessoa where id=?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setLong(1, vo.getId());
			rs = ptst.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
