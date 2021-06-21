package it.application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceltaTemporizzataGUI extends Application {
	
	@Override
	public void start(Stage palcoscenico) throws Exception {
	 final VBox verticale = new VBox(20.);
	 verticale.setPadding(new Insets(20.));
	 final Label stato = new Label("Stato porta: Chiusa...");
	 final Label timer = new Label();
	 final Button apri = new Button("Apri");
	 final Button conferma = new Button("Conferma");
	 conferma.setDisable(true);
	 GestoreRichiesta gestoreRichiesta = new GestoreRichiesta(conferma,stato);
	 GestoreConferma gestoreConferma = new GestoreConferma(stato);
	 apri.addEventHandler(MouseEvent.MOUSE_CLICKED, gestoreRichiesta);
	 conferma.addEventHandler(MouseEvent.MOUSE_CLICKED, gestoreConferma);
	 verticale.getChildren().addAll(stato, apri, conferma, timer);
	 final Scene scena = new Scene(verticale);
	 palcoscenico.setScene(scena);
	 palcoscenico.setTitle("Scelta Temporizzata");
	 palcoscenico.show();
	}
}
