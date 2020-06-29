
package br.edu.ufersa.gabriel.model.VO;
import java.util.Calendar;
public class FuncionarioVO{
    String nome;
    String cpf;
    String email;
    public double salario;
    Calendar dataDeAdmissao;

    
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null) {
			System.out.println("sem nome");
			this.nome = "pessoa sem nome";
		}else {
			if (nome.equals("")) {
				
				System.out.println("sem nome");
				this.nome = "pessoa sem nome";
			}
			else {
				this.nome = nome;
			}
		}
			
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Calendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Calendar dataDeAdmissao) {
		//verificar se a dataAdmissao >= a dataInicio
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public FuncionarioVO(){

    }
    public FuncionarioVO(String nome){
       setNome(nome);
    }
    public FuncionarioVO(String nome, String cpf){
      setNome(nome);
      setCpf(cpf);
    }
    public FuncionarioVO(double salario){
        setSalario(salario);
    }

  
}
