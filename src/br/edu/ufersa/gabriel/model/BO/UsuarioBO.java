package br.edu.ufersa.gabriel.model.BO;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.edu.ufersa.gabriel.exception.AutenticationException;
import br.edu.ufersa.gabriel.exception.InsertException;
import br.edu.ufersa.gabriel.model.DAO.GerenteDAO;
import br.edu.ufersa.gabriel.model.DAO.ResponsavelDAO;
import br.edu.ufersa.gabriel.model.DAO.UsuarioDAO;
import br.edu.ufersa.gabriel.model.DAO.UsuarioInterDAO;
import br.edu.ufersa.gabriel.model.VO.GerenteVO;
import br.edu.ufersa.gabriel.model.VO.PessoaVO;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;

public class UsuarioBO<VO extends UsuarioVO> extends BaseBO<VO> implements UsuarioInterBO<VO>{
	static private UsuarioInterDAO<UsuarioVO> usuDAO = new UsuarioDAO<UsuarioVO>();
	static private UsuarioInterDAO<GerenteVO> gerDAO = new GerenteDAO<GerenteVO>();
	static private UsuarioInterDAO<ResponsavelVO> respDAO = new ResponsavelDAO();
	
	public UsuarioVO autenticar (UsuarioVO vo) throws AutenticationException{
		ResultSet usuRS = usuDAO.buscarPorLogin(vo);
		try {
			//encontrou usuario
			if(usuRS.next()) {
				if(usuRS.getString("senha").equals(vo.getSenha())) {
					//existe e senha ok. Descobrir se é responsável ou gerente
					GerenteVO ger = new GerenteVO();
					ger.setIdPessoa(usuRS.getLong("pessoaId"));
					
					ResultSet gerRS = gerDAO.buscarPorIdPessoa(ger);
					if(gerRS.next()) {
						//é um gerente
						ger.setLogin(vo.getLogin());
						ger.setCpf(usuRS.getString("cpf"));
						ger.setEmail(usuRS.getString("email"));
						ger.setNome(usuRS.getString("nome"));
						ger.setNome(usuRS.getString("telefone"));
						ger.setIdUsu(usuRS.getLong("usuId"));
						ger.setSalario(gerRS.getDouble("Salario"));
						return ger;
					}
					else {
						//tem que ser um responsavel. vamos pegar os dados dele no banco.
						ResponsavelVO res = new ResponsavelVO();
						res.setIdPessoa(usuRS.getLong("pessoaId"));
						
						ResultSet resRS = respDAO.buscarPorIdPessoa(res);
						if(resRS.next()) {//cumprir o protocolo por desencargo de consciência
							res.setLogin(vo.getLogin());
							res.setCpf(usuRS.getString("cpf"));
							res.setEmail(usuRS.getString("email"));
							res.setNome(usuRS.getString("nome"));
							res.setNome(usuRS.getString("telefone"));
							res.setIdUsu(usuRS.getLong("usuId"));
							res.setDepartamento(resRS.getString("departamento"));
							return res;
						}
						else throw new AutenticationException();
					}
					
					
				}
				else throw new AutenticationException();
			}
			else throw new AutenticationException();
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw new AutenticationException();
		}
		
	}
	
	
	
	public void editar(UsuarioVO usu) {
		usu.setSenha("novaSenha");
	}

}
