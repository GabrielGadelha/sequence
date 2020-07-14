package br.edu.ufersa.gabriel.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.model.DAO.PessoaDAO;
import br.edu.ufersa.gabriel.model.DAO.ResponsavelDAO;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;

public class ResponsavelBO implements BaseInterBO<ResponsavelVO>{
	PessoaDAO<ResponsavelVO> dao = new ResponsavelDAO();
	public void cadastrar(ResponsavelVO vo) throws InsertException {
		ResultSet rs = dao.listarPorCPF(vo);
		try {
			if (rs.next()) {
				throw new InsertException("Impossível cadastrar, pois já existe responsável com este CPF");
			}
			else {
				dao.inserir(vo);
			}
		}
		catch(SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	@Override
	public void buscarPorCPF(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorNome(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorId(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorData(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscar() throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterar(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remover(ResponsavelVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	
	
	/*	public List<PessoaVO> listarTodos(){
	List<PessoaVO> pessoas = new ArrayList<PessoaVO>();
		try {
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while(rs.next()) {
			PessoaVO vo = new FuncionarioVO();
			vo.setCpf(rs.getString("cpf"));
			vo.setEmail(rs.getString("email"));
			vo.setNome(rs.getString("nome"));
			vo.setTelefone(rs.getString("telefone"));
			vo.setId(rs.getLong("id"));
			pessoas.add(vo);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
*/
}
