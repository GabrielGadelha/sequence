 package br.edu.ufersa.gabriel.model.VO;
 import java.util.Calendar;
 public class ProjetoVO{
    public long id;
    public String nome;
    public String descricao;
    private double orcamento;
    private double saldo;
    public Calendar inicioProjeto;
    public FuncionarioVO equipe[] ;
    public DocumentoVO documentos[];
    public ResponsavelVO responsavel;
    public  GerenteVO gerente;
    public double getOrcamento(){
        return orcamento;
    }
    public void setOrcamento( double orcamento ){
       if(orcamento>0)
            this.orcamento = orcamento;
       else System.out.println("Valor inválido");
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
       if (saldo>0)
         this.saldo = saldo;
       else System.out.println("Valor inválido");
    }
    public String toString(){
        String obj="";
        obj =  "Id= " +id;
        obj = obj + "\n" + "Nome: " + nome;
        obj = obj + "\n" + "Responsável " + responsavel.toString();
        obj = obj + "\n" + "Gerente " + gerente.toString();
        obj = obj + "\n" + "Orçamento/Saldo: " + orcamento + "/" + saldo;
       return obj;
    }
 }
