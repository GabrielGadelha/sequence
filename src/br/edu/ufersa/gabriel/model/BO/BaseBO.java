package br.edu.ufersa.gabriel.model.BO;

import java.util.List;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.exception.NotFoundException;

public class BaseBO<VO> implements BaseInterBO<VO>{
 
	@Override
	public void cadastrar(VO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarPorId(VO vo) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VO> listar() throws InsertException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(VO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(VO vo) throws InsertException {
		// TODO Auto-generated method stub
		
	}

}
