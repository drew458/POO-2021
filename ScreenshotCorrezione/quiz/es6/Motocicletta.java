package es6;

class Concessionario {
	public void cambiaModello(Motocicletta motocicletta, String nuovoModello) {
		motocicletta.setModello(nuovoModello);
	}
}

public class Motocicletta {
	private String modello;
	
	public Motocicletta(String modello) {
		this.modello = modello;
	}

	public void setModello(String nuovoModello) {
		this.modello = nuovoModello;		
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public static void main(String[] args) {
		Concessionario concessionario = new Concessionario();
		Motocicletta moto = new Motocicletta("GUZZI");
		
		System.out.println(moto.getModello());
		System.out.println(" - ");
		concessionario.cambiaModello(moto, "HARLEY");
		System.out.println(moto.getModello());
	}

}

/* 
 * GUZZI - HARLEY
 *
*/