package br.edu.ufersa.gabriel.view;


import br.edu.ufersa.gabriel.controller.FrontController;
import br.edu.ufersa.gabriel.model.VO.UsuarioVO;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Telas extends Application{
	private static Stage primaryStage;
	
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}
	public static void setPrimaryStage(Stage primaryStage) {
		Telas.primaryStage = primaryStage;
	}
	public void start(Stage primaryStage) throws Exception {
		setPrimaryStage(primaryStage);
		primaryStage.setTitle("Sistema SEQUENCE");
		primaryStage.show();
		telaLogin();
		
		
	}
	
	public static void telaLogin() throws Exception{
		Parent root = FXMLLoader.load(Telas.class.getResource("VE/telaDeLogin.fxml"));
		
		Scene cena = new Scene(root);
		
		
		primaryStage.setScene(cena);
	}
	
	public static void telaPrincipalResp(UsuarioVO vo) throws Exception{
		Parent root = FXMLLoader.load(Telas.class.getResource("VE/telaResponsavel.fxml"));
		
		
		
		Scene cena = new Scene(root);
		
		
		primaryStage.setScene(cena);
	}
	
	public static void telaPrincipalGer() throws Exception{
		Parent root = FXMLLoader.load(Telas.class.getResource("VE/telaGerente.fxml"));
		
		Scene cena = new Scene(root);
		
		
		primaryStage.setScene(cena);
	}
	public static void main(String ... args) {
		launch();
	}

}
