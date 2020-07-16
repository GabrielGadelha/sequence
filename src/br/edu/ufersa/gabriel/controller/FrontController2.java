package br.edu.ufersa.gabriel.controller;

import br.edu.ufersa.gabriel.exception.AutenticationException;
import br.edu.ufersa.gabriel.model.BO.UsuarioBO;
import br.edu.ufersa.gabriel.model.BO.UsuarioInterBO;
import br.edu.ufersa.gabriel.model.VO.ResponsavelVO;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FrontController2 {
	@FXML private Label erroAut;
	@FXML private TextField login;
	@FXML private TextField senha;
	
	UsuarioInterBO<UsuarioVO> usuBO = new UsuarioBO<UsuarioVO>();
	
	public void autenticar(ActionEvent event) throws Exception{
		System.out.println("CHegou aqui!");
		UsuarioVO vo = new UsuarioVO();
		vo.setLogin(login.getText());
		vo.setSenha(senha.getText());
		
		try
		{
			UsuarioVO autenticado = usuBO.autenticar(vo);
			if(autenticado instanceof ResponsavelVO) {
				//abrir a janela principal de responsavel
			}
			else {
				//abrir a janela de gerente
			}
		}
		catch(AutenticationException e) {
			erroAut.setText("Usuário ou senha inválidos!");
			erroAut.setVisible(true);
		}
		
	}
}
