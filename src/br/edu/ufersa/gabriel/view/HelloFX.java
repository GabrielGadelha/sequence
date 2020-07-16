package br.edu.ufersa.gabriel.view;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class HelloFX extends Application{
	
	@Override
	public void start(Stage pS) throws Exception {
		Label msg = new Label();
		msg.setText("Famoso Hello world em JavaFX");
		Button botao = new Button("ok");
		Image imageOk = new Image(getClass().getResourceAsStream("VE/ok.png"));
	    Button botao2 = new Button("OK-Estiloso", new ImageView(imageOk));
	    
		HBox root = new HBox();
		VBox root2 = new VBox();
		BorderPane root3 = new BorderPane();
		StackPane root4 = new StackPane();
		TextFlow root5 = new TextFlow();
		AnchorPane root6 = new AnchorPane();
		TilePane root7 = new TilePane();
		GridPane root8 = new GridPane();
		FlowPane root9 = new FlowPane();
		
		root.getChildren().add(msg);
		root.getChildren().add(botao);
		root.getChildren().add(botao2);	
		
		RadioButton rb1 = new RadioButton();
		rb1.setText("Opção 1");
		RadioButton rb2 = new RadioButton("Opção 2");
		RadioButton rb3 = new RadioButton("op3");

		final ToggleGroup group = new ToggleGroup();
		rb1.setToggleGroup(group);
		rb2.setToggleGroup(group);
		rb2.setSelected(true);
		rb3.setToggleGroup(group);
		root2.getChildren().add(rb1);
		root2.getChildren().add(rb2);
		root2.getChildren().add(rb3);
	    
		Scene cena = new Scene(root2, 500, 300);
		
		pS.setTitle("Primeira tela");
		pS.setScene(cena);
		pS.show();
	}
	public static void main(String args[]) {
		launch();
	}
	
}
