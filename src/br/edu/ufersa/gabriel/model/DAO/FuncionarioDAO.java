package br.edu.ufersa.gabriel.model.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;

public class FuncionarioDAO extends PessoaDAO<FuncionarioVO>{
	@Override
	public void inserir(FuncionarioVO vo) {
		try {
			super.inserir(vo);
			String sql = "insert into Funcionario (salario, id_pessoa, id_projeto, data_admissao) values (?,?,?,?)";
			PreparedStatement ptst;
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setDouble(1, vo.getSalario());
			ptst.setLong(2, vo.getIdPessoa());
			ptst.setLong(3, vo.getIdProjeto());
			ptst.setDate(4, new Date(vo.getDataDeAdmissao().getTimeInMillis()));
			int affectedRows = ptst.executeUpdate();
	        if (affectedRows == 0) {
	        	throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
		    }
		    ResultSet generatedKeys = ptst.getGeneratedKeys();
		    if (generatedKeys.next()) {
		         vo.setIdFunc(generatedKeys.getLong(1));
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
	public void deletar(FuncionarioVO vo) {
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
	public void atualizar(FuncionarioVO vo) {
		String sql = "update Pessoa set nome = ? where id= ?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, vo.getNome());
			ptst.setLong(2, vo.getIdFunc());
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
	
	@Override
	public ResultSet buscarPorId(FuncionarioVO vo) {
		String sql = "select * from Pessoa where id=?";
		PreparedStatement ptst;
		ResultSet rs = null;
				
 		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setLong(1, vo.getIdFunc());
			rs = ptst.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
