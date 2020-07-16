package br.edu.ufersa.gabriel.model.DAO;

import java.sql.ResultSet;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public interface UsuarioInterDAO <VO extends UsuarioVO> extends PessoaInterDAO<VO> {
	public ResultSet buscarPorLogin(VO vo);
	public ResultSet buscarPorIdPessoa(VO vo);
}
