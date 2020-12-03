package br.edu.ufersa.gabriel.model.DAO;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.List;

import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioInterDAO<UsuarioVO> dao2 = new UsuarioDAO<UsuarioVO>();
		
	UsuarioVO vo  =new UsuarioVO();
		vo.setCpf("123.321.123-25");
		vo.setEmail("dudu@email.com");
		vo.setNome("novo dudu");
		vo.setTelefone("8412332112");
		vo.setIdPessoa(new Long(3));
		vo.setLogin("resp");;
		
	/*	PessoaVO vo2  =new FuncionarioVO();
		vo2.setCpf("222.321.123-25");
		vo2.setEmail("dudu3@email.com");
		vo2.setNome("novo Luiz dudu");
		vo2.setTelefone("8412dsa112");
		vo2.setIdPessoa(new Long(4));*/
		
		//dao2.editar(vo);
		//dao2.editar(vo2);
		FuncionarioDAO funcDAO = new FuncionarioDAO();
		ResultSet rs; 
		try {
			rs = funcDAO.listar();
			if(rs.next()) {
				Calendar dataAdmissao = Calendar.getInstance();
				dataAdmissao.setTime(rs.getDate("data_admissao"));
				String saida = "DIA: " + dataAdmissao.get(Calendar.DAY_OF_MONTH) + "\n"+
						"MÊS: " +  dataAdmissao.get(Calendar.MONTH) + "\n" +
						"ANO: " +  dataAdmissao.get(Calendar.YEAR);
				System.out.println(saida);
			}
				
			
		}
		catch(Exception e) {
			
		}
		//pessoas = dao2.listar();
		
		/*for (PessoaVO vo3: pessoas ) {
			System.out.println(vo3.getNome());
		}
		*/
		
		
		
	}

}
