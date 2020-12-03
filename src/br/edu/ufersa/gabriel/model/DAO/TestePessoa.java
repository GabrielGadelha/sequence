package br.edu.ufersa.gabriel.model.DAO;

import java.sql.ResultSet;
import java.util.List;

import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;

public class TestePessoa {
	public static void main (String args[]) {
		FuncionarioVO p = new FuncionarioVO();
		p.setCpf("546546465");
		p.setEmail("asdfkadsl.com");
		p.setIdFunc(new Long(1));
		
		FuncionarioDAO dao = new FuncionarioDAO();
		//dao.inserir(p);
	//	dao.atualizar(p);
		//ResultSet resultado = dao.listar();
		System.out.println(dao.buscarPorId(p));
		
		
	}

}
