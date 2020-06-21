class ProjetoBO{
    ProjetoDao dao = new ProjetoDao();
    void    adicionar (ProjetoVO p){
            dao.salvar(p);

    }
}
