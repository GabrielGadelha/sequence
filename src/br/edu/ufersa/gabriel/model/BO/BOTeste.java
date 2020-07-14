package br.edu.ufersa.gabriel.model.BO;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.model.DAO.PessoaDAO;
import br.edu.ufersa.gabriel.model.DAO.UsuarioDAO;
import br.edu.ufersa.gabriel.model.VO.*;
public class BOTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseInterBO<GerenteVO> bo = new GerenteBO();
		
		
		GerenteVO vo = new GerenteVO() ;
		vo.setCpf("999.968.888-55");
		vo.setSenha("ger1");
		vo.setLogin("ger");
		vo.setSalario(2500.25);
		vo.setEmail("ger@ufersa.edu.br");
		vo.setNome("pedrinho");
		vo.setTelefone("(84)9 777-88888");
		try {
			bo.cadastrar(vo);
		}
		catch(InsertException e) {
			e.printStackTrace();
		}
		
		
	}

}
