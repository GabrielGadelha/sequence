package br.edu.ufersa.gabriel.model.DAO;

import java.sql.ResultSet;
import java.util.List;

import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaDAO<PessoaVO> dao2 = new PessoaDAO<PessoaVO>();
		
	PessoaVO vo  =new FuncionarioVO();
		vo.setCpf("123.321.123-25");
		vo.setEmail("dudu@email.com");
		vo.setNome("novo dudu");
		vo.setTelefone("8412332112");
		vo.setIdPessoa(new Long(3));
		
		PessoaVO vo2  =new FuncionarioVO();
		vo2.setCpf("222.321.123-25");
		vo2.setEmail("dudu3@email.com");
		vo2.setNome("novo Luiz dudu");
		vo2.setTelefone("8412dsa112");
		vo2.setIdPessoa(new Long(4));
		
		//dao2.editar(vo);
		//dao2.editar(vo2);
		ResultSet rs; 
		rs = dao2.listarPorCPF(vo);
		System.out.println(rs);
		//pessoas = dao2.listar();
		
		/*for (PessoaVO vo3: pessoas ) {
			System.out.println(vo3.getNome());
		}
		*/
		
		
		
	}

}
