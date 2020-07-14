 package br.edu.ufersa.gabriel.model.BO;
 import br.edu.ufersa.gabriel.model.VO.ProjetoVO;
 import br.edu.ufersa.gabriel.model.VO.DocumentoVO;
 import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;
 public class ProjetoBO{
    static long idGenerator=1;
    public ProjetoBO(){ }

    public void adicionar(ProjetoVO projeto){
        projeto.id = idGenerator;
        idGenerator++;
        System.out.println("Adicionado o projeto com os seguintes parametros: "+projeto.toString() + "\n" +"__________________________________________");
    }
    public void remover ( ProjetoVO projeto, DocumentoVO documento){
       // projeto.documentos.remove(documento);

       // docDAO.remover(documento);
    }
    public void remover (ProjetoVO projeto,FuncionarioVO funcionario){
       // projeto.funcionarios.remove(funncionario);

       // funcDao.remover(funcionario);
    }

   /* public void remover (ProjetoVO projeto){
        for (DocumentoVO doc : projeto.documentos)

        {
            docDAO.remover(doc);
        }
        for (FuncionarioVO func : projeto.funcionarios)
        {
            funcDAO.remover(func);
        }
        projDAO.remover(projeto);
    }*/
}

