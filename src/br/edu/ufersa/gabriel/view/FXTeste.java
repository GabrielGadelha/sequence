package br.edu.ufersa.gabriel.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXTeste extends Application{
	
	@Override
	public void start(Stage pS) throws Exception {
		// TODO Auto-generated method stub
		Label msg = new Label();
		msg.setText("Famoso Hello world em JavaFX");
		
		Image imageOk = new Image(getClass().getResourceAsStream("VE/ok.png"));
		
	    Button botao = new Button("OK", new ImageView(imageOk));
	    
	    BorderPane bPane = new BorderPane();   
	    bPane.setBottom(botao);
		Scene cena = new Scene(bPane, 750, 400);
		
		pS.setTitle("Primeira tela");
		pS.setScene(cena);
		pS.show();
	}
	public static void main(String args[]) {
		launch();
	}
	
}
