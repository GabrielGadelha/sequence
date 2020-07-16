package br.edu.ufersa.gabriel.model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public class UsuarioDAO<VO extends UsuarioVO> extends PessoaDAO<VO>  implements UsuarioInterDAO<VO>{
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
	public ResultSet buscarPorId(VO vo) {
		String sql = "select * from Usuario where id=?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setLong(1, vo.getIdUsu());
			rs = ptst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	@Override
	public ResultSet buscarPorLogin(VO vo) {
		String sql = "select p.id as pessoaId,p.nome,p.cpf,p.telefone,p.email as email,u.id as usuId, u.login, u.senha"
				+ " from Pessoa p, Usuario u where u.login=? and p.id=u.id_pessoa";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getLogin());
			rs = ptst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	@Override
	public ResultSet buscarPorIdPessoa(VO vo) {
		String sql = "select * from Usuario where id_pessoa=?";
		PreparedStatement ptst;
		ResultSet rs= null;
		System.out.println(vo.getIdPessoa())	;	
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setLong(1, vo.getIdPessoa());
			rs = ptst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
}
