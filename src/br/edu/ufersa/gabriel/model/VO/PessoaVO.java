package br.edu.ufersa.gabriel.model.VO;

public abstract class PessoaVO {
	protected String nome;
	private String cpf;
	private String email;
	private String telefone;
	private Long idPessoa;
	
	
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long id) {
		this.idPessoa = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PessoaVO(String nome) {
		setNome(nome);
	}
	public PessoaVO() {
	}
	public String toString() {
		String saida = "";
		
		saida = saida + "\n" + "id: " + idPessoa;
		saida = saida + "\n" + "nome: " + nome;
		saida = saida + "\n" + "cpf: " + cpf;
		saida = saida + "\n" + "email: " + email;
		saida = saida + "\n" + "telefone: " + telefone;
		return saida;
	}
	
}
