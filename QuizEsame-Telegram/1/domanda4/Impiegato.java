package domanda4;

class GestoreUfficio {

	public void cambiaReparto(Impiegato impiegato, String nuovoReparto) {
		impiegato.setReparto(nuovoReparto);
	}

}

public class Impiegato {
	private String nome;
	private String reparto;

	public Impiegato(String nome, String reparto) {
		this.nome = nome;
		this.reparto = reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public String getNome() {
		return this.nome;
	}

	public String getReparto() {
		return this.reparto;
	}

	public static void main(String[] args) {
		GestoreUfficio gestoreUfficio = new GestoreUfficio();
		Impiegato impiegatoRossi = new Impiegato("Mario Rossi","RisorseUmane");

		System.out.print(impiegatoRossi.getReparto());
		System.out.print(" - ");
		gestoreUfficio.cambiaReparto(impiegatoRossi, "Dirigenza");
		System.out.print(impiegatoRossi.getReparto());
	}

}

/* 
 * RisorseUmane - Dirigenza
 */


