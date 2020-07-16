package br.edu.ufersa.gabriel.model.BO;

import br.edu.ufersa.gabriel.exception.AutenticationException;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public interface UsuarioInterBO<VO extends UsuarioVO> extends BaseInterBO<VO>{
	public UsuarioVO autenticar (VO vo) throws AutenticationException;
}
