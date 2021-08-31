package ex_cambioStringa_ritornaVecchioValore;

//Che cosa stampa?
public class Abitazione {

	private String proprietario;
	public Abitazione(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getProprietario() {
		return this.proprietario;
	}
	public String cambiaProprietario(String nuovoProprietario) {
		String vecchioProprietario;
		vecchioProprietario = this.proprietario;
		this.proprietario = nuovoProprietario;
		return vecchioProprietario;
	}
	public static void main(String[] args) {
		Abitazione al = new Abitazione("Rossi");
		Abitazione a2 = new Abitazione("Verdi");
		al.cambiaProprietario(a2.cambiaProprietario("Bianchi"));

		al = a2;

		System.out.println(al.getProprietario());
		System.out.println(a2.getProprietario());

		a2.cambiaProprietario(al.cambiaProprietario("Gialli")); 
		a2 = new Abitazione("Carilli");

		System.out.println(al.getProprietario());
		System.out.println(a2.getProprietario());
	}
}

/*
Bianchi
Bianchi
Bianchi
Carilli

SPIEGAZIONE

a1 -> Abitazione(Rossi)
a2 -> Abitazione(Verdi)

a2.cambia(Bianchi) ritorna Verdi
a1.cambia(Verdi)

a1 -> Abitazione(Verdi)
a2 -> Abitazione(Bianchi)

a1 = a2
a1 -> Abitazione(Bianchi)
a2 -> Abitazione(Bianchi)

SI STAMPA
Bianchi
Bianchi

a1.cambia(Gialli) ritorna Bianchi
a1 -> Abitazione(Gialli)
a2 -> Abitazione(Gialli)

a2.cambia(Bianchi)
a1 -> Abitazione(Bianchi)
a2 -> Abitazione(Bianchi)

a2 -> Abitazione(Carilli)

a1 -> Abitazione(Bianchi)
a2 -> Abitazione(Carilli)

SI STAMPA
Bianchi
Carilli

a1 punta al vecchio oggetto puntato da a2, quindi rimane Bianchi

---------Altre Risposte--------

Rossi
Bianchi
Bianchi
Carilli

Rossi
Verdi
Bianchi
Carilli

Rossi
Rossi
Rossi
Carilli

Rossi
Bianchi
Rossi
Carilli

Bianchi
Rossi
Verdi
Carilli
*/