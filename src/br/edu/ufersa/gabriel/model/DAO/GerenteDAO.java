package br.edu.ufersa.gabriel.model.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;

public class GerenteDAO extends UsuarioDAO<GerenteVO>{
	@Override
	public void inserir(GerenteVO vo) {
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
}
