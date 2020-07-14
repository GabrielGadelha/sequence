import br.edu.ufersa.gabriel.model.VO.*;
import br.edu.ufersa.gabriel.model.BO.*;
import java.util.Scanner;
import java.util.Calendar;
class Principal{
    public static void main (String arg[]){
        Scanner leitura = new Scanner(System.in);
        ProjetoBO projBO = new ProjetoBO();
        ProjetoVO proj = new ProjetoVO();
        ResponsavelVO resp = new ResponsavelVO();
        GerenteVO ger = new GerenteVO();
        DocumentoVO [] docs = new DocumentoVO[2];
        FuncionarioVO [] funcs = new FuncionarioVO[2];
        //Coletar os dados de um projeto
        System.out.println("Informe o nome do projeto!");
        String nomeProj = leitura.nextLine();
        System.out.println("Informe a descrição do projeto!");
        String descProj = leitura.nextLine();
        System.out.println("Informe o orçamento do projeto!");
        double orcProj = leitura.nextDouble();
        System.out.println("Informe o saldo do projeto!");
        double saldoProj = leitura.nextDouble();

        //Criar um responsavel qualquer
        resp = new ResponsavelVO("Geraldo","123...","mail@bol.com");
        //Criar um gerente qualquer
        ger = new GerenteVO("dudu","765.122.222-12","dudu@gmail.com");
        //Criar um documento qualquer
        Calendar dataInclusao = Calendar.getInstance();
        Calendar dataExpiracao = Calendar.getInstance();
        DocumentoVO doc = new DocumentoVO("Contas","drive.google.com/projetoX", dataInclusao, dataExpiracao);
        docs[0] = doc;
        //Criar um funcionario
        FuncionarioVO func = new FuncionarioVO("Pedrinho", "454.324.456-25dfads");
        func.salario = 100000000.00;
        funcs[0]=func;
        //montar o objeto projeto e enviar para o ProjetoBO adicionar
        proj.nome = nomeProj;
        proj.descricao = descProj;
        proj.setOrcamento ( orcProj);
        proj.setSaldo(saldoProj);
        proj.responsavel = resp;
        proj.gerente = ger;
        proj.documentos = docs;
        proj.equipe = funcs;

        projBO.adicionar(proj);
        ProjetoBO projBO2 = new ProjetoBO();
        projBO2.adicionar(proj);
        projBO.adicionar(proj);
        projBO2.adicionar(proj);
    }
}
