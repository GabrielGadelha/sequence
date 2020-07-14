package br.edu.ufersa.gabriel.model.VO;

public class UsuarioVO extends PessoaVO{
	private String senha;
	private String login;
	private Long idUsu;
	
	
	public Long getIdUsu() {
		return idUsu;
	}


	public void setIdUsu(Long idUsu) {
		this.idUsu = idUsu;
	}


	public String getSenha() {
		return senha;
	}

	
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public UsuarioVO() {
		
	}

}
