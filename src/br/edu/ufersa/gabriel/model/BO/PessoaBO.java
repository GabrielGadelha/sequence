package br.edu.ufersa.gabriel.model.BO;

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.exception.NotFoundException;
import br.edu.ufersa.gabriel.model.DAO.PessoaDAO;
import br.edu.ufersa.gabriel.model.DAO.PessoaInterDAO;
import br.edu.ufersa.gabriel.model.VO.FuncionarioVO;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;


public class PessoaBO implements BaseInterBO<PessoaVO>{
	static private PessoaInterDAO<PessoaVO> pessoaDAO = new PessoaDAO<PessoaVO>();

	public List<PessoaVO> listarTodos(){
		//List<PessoaVO> pessoas = new ArrayList<PessoaVO>();
		//List<PessoaVO> pessoas = new Vector<PessoaVO>(); 
		
		List<PessoaVO> pessoas = new LinkedList<PessoaVO>();
		return pessoas;
		ResultSet pessoaRS = pessoaDAO.listar();
		while(pessoaRS.next()) {//cmontar cada objeto e inserir na lista
			PessoaVO vo = new PessoaVO();
			vo.setCpf(pessoaRS.getString("cpf"));
			vo.setEmail(pessoaRS.getString("email"));
			vo.setNome(pessoaRS.getString("nome"));
			vo.setNome(pessoaRS.getString("telefone"));
			
			pessoas.add(vo);
		}
		return pessoas;
		
		FuncionarioVO funcVO = new FuncionarioVO();
		GerenteVO gerVO = new GerenteVO();
		cadastrar (funcVO);
		cadastrar (gerVO);
		
		
}

	@Override
	public void cadastrar(PessoaVO vo) throws InsertException {
		     pessoaDAO.inserir(vo);
		    FuncionarioVO funcVO = new FuncionarioVO();
		    if (vo.getClass() == funcVO.getClass())
		    {
		    	 funcDAO.inserir(vo);
		    }
		    
			try {
				//encontrou usuario
				if(pessoaRS.next()) {
					throw new InsertException("Pessoa já esta cadastrada no sistema");
				}
				else
				{
					pessoaDAO.inserir(vo);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void remover(PessoaVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(PessoaVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PessoaVO> listar() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void buscarPorId(PessoaVO vo) throws NotFoundException {
		// TODO Auto-generated method stub
		
	}
}
