package br.edu.ufersa.gabriel.model.BO;

import java.util.List;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.exception.NotFoundException;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;

public interface BaseInterBO<VO> {
	public void cadastrar(VO vo) throws InsertException;
	public void buscarPorId(VO vo) throws NotFoundException;
	public List<VO> listar() throws InsertException;
	public void alterar(VO vo) throws InsertException;
	public void remover(VO vo) throws InsertException;
}
