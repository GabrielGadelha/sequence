package br.edu.ufersa.gabriel.model.VO;
public class ResponsavelVO extends UsuarioVO{
    private String departamento;
    private Long id;

    public ResponsavelVO(){

    }
    public String toString(){
       String saida = "";
       saida = saida + "id do responsavel: " + id;
       saida = saida + "\n" + super.toString();
       saida = saida + "\n" + "departamento: " + departamento;
       return saida;
    }
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
