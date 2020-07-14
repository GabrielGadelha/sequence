package br.edu.ufersa.gabriel.model.BO;

import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public interface UsuarioInterBO {
	public abstract UsuarioVO [] listar();
	public void editar(UsuarioVO usu);
	
}
