package br.edu.ufersa.gabriel.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaLogin extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("VE/telaDeLogin.fxml"));
		
		Scene cena = new Scene(root);
		
		primaryStage.setTitle("Sistema SEQUENCE");
		primaryStage.setScene(cena);
		primaryStage.show();
		
		
	}
	
	public static void main(String ... args) {
		launch();
	}

}
