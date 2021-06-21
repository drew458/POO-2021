package it.application;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class GestoreConferma implements EventHandler<MouseEvent> {

	private Labeled stato;
	public GestoreConferma(Label daCambiare) {
		this.stato = daCambiare;
	}
	
	public void handle(MouseEvent evento) {
		if (evento.getButton() == MouseButton.PRIMARY)
			this.stato.setText("Stato porta: Aperta!");
	}

}
