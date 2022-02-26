package it.application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SistemaSicurezzaPorta extends Thread {

	private Button conferma; // di conferma apertura porta
	private Label timer;
	public SistemaSicurezzaPorta(Button pulsante, Label timer) {
		this.conferma = pulsante;
		this.timer = timer;
	}
	
	@Override
	public void run() {
		try {
			this.conferma.setDisable(false);
			this.timer.setText("Mancano 2 secondi");
			Thread.sleep(1000);
			this.timer.setText("Manca 1 secondo");
			Thread.sleep(1000);
			this.timer.setText("Tempo Scaduto!");
			this.conferma.setDisable(true);
		} catch (InterruptedException e) { }
	}
}
