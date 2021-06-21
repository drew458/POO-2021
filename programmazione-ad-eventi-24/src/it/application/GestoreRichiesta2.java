package it.application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class GestoreRichiesta2 {
	private Button conferma;
	private Label timer;
	
	public GestoreRichiesta2(Button pulsante, Label label) {
		this.conferma = pulsante;
		this.timer = label;
	}

	public void handle(MouseEvent event) {
		if (event.getButton() == MouseButton.PRIMARY) {
			final Thread t = new SistemaSicurezzaPorta(this.pulsante);
			t.start();
		}
	}
}
