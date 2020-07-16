package br.edu.ufersa.gabriel.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.gabriel.model.VO.PessoaVO;

public interface PessoaInterDAO<VO extends PessoaVO> extends BaseInterDAO<VO>{
	 public ResultSet buscarPorNome(VO entity);
	 public ResultSet buscarPorCPF(VO entity);
}
