package br.edu.ufersa.gabriel.model.BO;

import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.model.DAO.BaseInterDAO;
import br.edu.ufersa.gabriel.model.DAO.GerenteDAO;
import br.edu.ufersa.gabriel.model.DAO.PessoaDAO;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;


public class GerenteBO implements BaseInterBO<GerenteVO>{
	BaseInterDAO<GerenteVO> dao = new GerenteDAO();
	public void cadastrar(GerenteVO vo) throws InsertException {
		try {
			ResultSet rs = dao.listarPorCPF(vo);
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
	public void buscarPorCPF(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorNome(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorId(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscarPorData(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buscar() throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alterar(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remover(GerenteVO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}
}
