package br.edu.ufersa.gabriel.model.BO;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO; 
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;

public class UsuarioBO implements UsuarioInterBO{
	public UsuarioVO [] listar() {
		ResponsavelVO resp = new ResponsavelVO();
		GerenteVO ger = new GerenteVO();
		
		UsuarioVO usuarios[] = new UsuarioVO[3];
		UsuarioVO usu = new UsuarioVO();
		resp.setLogin("Login de Responsavel");
		ger.setLogin("Login de gerente");
		usu.setLogin("login de usuario");
		usuarios[0] = resp;
		usuarios[1] = ger;
		usuarios[2] = usu;
		
		return usuarios;
	}
	public void editar(UsuarioVO usu) {
		usu.setSenha("novaSenha");
	}

}
