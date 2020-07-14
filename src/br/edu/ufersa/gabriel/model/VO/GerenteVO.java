package br.edu.ufersa.gabriel.model.VO;
public class GerenteVO extends UsuarioVO{
	private Long id;
	private double salario;
	    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public GerenteVO(){}
    public String toString(){
       String saida = "";
       saida = saida + "id do Gerente: " + id;
       saida = super.toString();
       saida = "\n" + "salario: " + salario;
       return saida;
    }
}
