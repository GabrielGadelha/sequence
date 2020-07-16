package br.edu.ufersa.gabriel.controller;

import br.edu.ufersa.gabriel.exception.AutenticationException; 
import br.edu.ufersa.gabriel.model.BO.UsuarioBO;
import br.edu.ufersa.gabriel.model.BO.UsuarioInterBO;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;
import br.edu.ufersa.gabriel.view.Telas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FrontController {
	@FXML private  Label falhaAut;
	@FXML private TextField login;
	@FXML private TextField senha;
		
	private static UsuarioInterBO<UsuarioVO> usuBO = new UsuarioBO<UsuarioVO>();
	
	
	public void autenticar(ActionEvent event) throws Exception{
		UsuarioVO vo = new UsuarioVO();
		vo.setLogin(login.getText());
		vo.setSenha(senha.getText());
		try {
			UsuarioVO autenticado = usuBO.autenticar(vo);
			if(autenticado instanceof ResponsavelVO ) {
				Telas.telaPrincipalResp(vo);
			}
			else {
				//ir para a tela principal de Gerente
				Telas.telaPrincipalGer();
			}
		}
		catch(AutenticationException e) {
			falhaAut.setText("Usuário ou senha inválidos");
			falhaAut.setVisible(true);
			//Telas.telaLogin();
		}
		
		
	}
	public void logout(ActionEvent event) throws Exception{
		Telas.telaLogin();
	}
	
}
