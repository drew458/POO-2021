package ex_extends_super;

//Il seguente programma:
public class Rivista extends Periodico{

	private Periodico inserto;

	public Rivista(String nome) {
		super(nome);
	}

	public void setInserto(Periodico inserto) {
		this.inserto = inserto;
	}

	public String toString() {
		if (inserto != null)
			return this.getNome() + " (rivista), con l'inserto: " + inserto.toString();
		return this.getNome() + " (rivista)";
	}

	public static void main(String argv[]) {
		Periodico p = new Periodico("Computer per tutti");
		Periodico q = new Rivista("Computer per pochi");
		System.out.println(p.toString());
		System.out.println(q.toString());
		Rivista r = new Rivista("Palmari per tutti");
		r.setInserto(q);
		System.out.println(r.toString());
	}
}

/*
compila e funziona correttamente

STAMPA
Computer per tutti (periodico)
Computer per pochi (rivista)
Palmari per tutti (rivista), con l'inserto: Computer per pochi (rivista)


-------Risposte sbagliate-------

compila, ma esce un errore a tempo di esecuzione
nessuna delle altre
Non compila
*/