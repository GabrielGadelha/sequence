package br.edu.ufersa.gabriel.model.VO;
public class Funcionario{
    String nome;
    String cpf;
    String email;
    double salario;

    void alterarSalario(double salario){
        this.salario = salario;
    }
    public static void main (string args[]){
       Funcionario f;
       f = new Funcionario();
       Funcionario f2 = f;
        f.salario = 3.17;
        f.nome = "dudu";
        f.cpf="111.222.333-15";
        //aqui
        f.alterarSalario(12.45);
        //agora aqui
    }
}
