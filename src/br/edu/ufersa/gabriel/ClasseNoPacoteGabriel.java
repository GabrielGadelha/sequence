//package br.edu.ufersa.gabriel;
public class ClasseNoPacoteGabriel{
    private String nome = "Dudu"  ;
    private int idade;
    private double a;
    private double b;
    private double c;

    
    
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			
		}
		else
		{
			this.nome = nome;
		}
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Não aceito idade negativa!!!");
		}
		else {
			this.idade = idade;-
		}
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public void mostrarNome(){

        System.out.println(nome);
    }
    void mostrarIdade(){
        System.out.println(idade);
    }
    void editar() {
    	//ainda não foi implementado
    }

}
