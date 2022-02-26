package it.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorldGUI extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage palcoscenico) throws Exception {
		final VBox incolonnati = new VBox(5.);
		incolonnati.setPadding(new Insets(10.));
		final Label etichetta = new Label("Hello World!");
		etichetta.setAlignment(Pos.CENTER);
		final Button pulsante = new Button("Cambia");
		final GestoreDiClick gestore = new GestoreDiClick(etichetta);
		pulsante.addEventHandler(MouseEvent.MOUSE_CLICKED, gestore);
		
		incolonnati.getChildren().add(etichetta);
		incolonnati.getChildren().add(pulsante);
		final Scene scena = new Scene(incolonnati);
		palcoscenico.setScene(scena);
		palcoscenico.show();
	}

}
