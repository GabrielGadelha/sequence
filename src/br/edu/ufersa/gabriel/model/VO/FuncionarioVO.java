
package br.edu.ufersa.gabriel.model.VO;
import java.util.Calendar;
public class FuncionarioVO extends PessoaVO{
	
    private double salario;
    private Calendar dataDeAdmissao;
    private Long idFunc;
    private Long idProjeto;

    
	public Long getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}
	public Long getIdFunc() {
		return idFunc;
	}
	public void setIdFunc(Long idFunc) {
		this.idFunc = idFunc;
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
   
    public String toString() {
		String saida = "";
		saida = saida + "\n" + "IdFunc: " + idFunc;
		saida = super.toString();
		saida = saida + "\n" + "Salário: " + salario;
		saida = saida + "\n" + "Data de admissão: " + dataDeAdmissao;
		return saida;
	}

  
}
