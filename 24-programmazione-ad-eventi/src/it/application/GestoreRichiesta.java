package it.application;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class GestoreRichiesta implements EventHandler<MouseEvent> {

	private Button conferma;
	private Label timer;
	public GestoreRichiesta(Button pulsante, Label label) {
		this.conferma = pulsante;
		this.timer = label;
	}
	
	@Override
	public void handle(MouseEvent event) {
		if (event.getButton() == MouseButton.PRIMARY) {
			try {
				this.conferma.setDisable(false); // attiva conferma
				timer.setText("Mancano 2 secondi");
				Thread.sleep(1000); // pausa di un secondo
				timer.setText("Manca 1 secondo");
				Thread.sleep(1000);
				timer.setText("Tempo Scaduto!");
				this.conferma.setDisable(true); // disattiva conferma
			} catch (InterruptedException e) { }
		}}
}
