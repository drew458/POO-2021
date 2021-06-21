package it.application;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class GestoreDiClick implements EventHandler<MouseEvent> {
	private Label daModificare;
	
	public GestoreDiClick(Label etichetta) {
		this.daModificare = etichetta;
	}
	
	@Override
	public void handle(MouseEvent evento) {
		if (evento.getButton().equals(MouseButton.PRIMARY))
			this.daModificare.setText("Cambiato!");
	}

}
