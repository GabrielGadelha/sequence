package br.edu.ufersa.gabriel.model.BO;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;

public interface BaseInterBO<VO> {
	public void cadastrar(VO vo) throws InsertException;
	public void buscarPorCPF(VO vo) throws InsertException;
	public void buscarPorNome(VO vo) throws InsertException;
	public void buscarPorId(VO vo) throws InsertException;
	public void buscarPorData(VO vo) throws InsertException;
	public void buscar() throws InsertException;
	public void alterar(VO vo) throws InsertException;
	public void remover(VO vo) throws InsertException;
}
