package br.edu.ufersa.gabriel.model.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;


public class GerenteDAO<VO extends GerenteVO> extends UsuarioDAO<VO>  implements UsuarioInterDAO<VO>{
	@Override
	public void inserir(VO vo) {
		try {
			super.inserir(vo);
			String sql = "insert into Gerente (salario, id_pessoa, id_usuario) values (?,?,?)";
			PreparedStatement ptst;
			ptst = getConnection().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ptst.setDouble(1, vo.getSalario());
			ptst.setLong(2, vo.getIdPessoa());
			ptst.setLong(3, vo.getIdUsu());
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
	public ResultSet buscarPorIdPessoa(VO vo) {
		String sql = "select * from Gerente where id_pessoa=?";
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
