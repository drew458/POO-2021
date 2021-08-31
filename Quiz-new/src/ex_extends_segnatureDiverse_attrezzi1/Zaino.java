package ex_extends_segnatureDiverse_attrezzi1;

//Cosa stampa questo programma?
public class Zaino extends Contenitore {

	public void addAttrezzo(Attrezzo a) {
		System.out.println("Zaino.addAttrezzo()");

		Attrezzo[] att = this.getAttrezzi();
		for (int i = 0; i < att.length; i++) {
			if (att[i] == null) {
				this.addAttrezzo(a, i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Zaino zaino = new Zaino();
		Attrezzo attrezzo = new Attrezzo();
		zaino.addAttrezzo(attrezzo);
		zaino.addAttrezzo(attrezzo);
		zaino.addAttrezzo(attrezzo, 1);
	}
}

/*
Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 0
Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 1


1)zaino.addAttrezzo(attrezzo)
Si va nel metodo dentro Zaino

SI STAMPA
Zaino.addAttrezzo()

i=0
this.addAttrezzo(a,0)
Si va nel metodo dentro Contenitore

this.attrezzi[0] -> a

SI STAMPA
Contenitore.addAttrezzo() --- aggiunto in 0

col break si esce dal for

2) zaino.addAttrezzo(attrezzo)

come prima

SI STAMPA

Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 1

Aggiunto in 1 perche 0 e' gia' occupato

3) zaino.addAttrezzo(attrezzo,1)

Si va direttamente al metodo dentro Contenitore
L'attrezzo dentro 1 viene aggiornato

SI STAMPA SOLO
Contenitore.addAttrezzo() --- aggiunto in 1


-----Risposte Sbagliate-----

Il codice non compila

Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 2

Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 0
Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 2

Contenitore.addAttrezzo() --- aggiunto in 0
Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 1

Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 0
Zaino.addAttrezzo()
Contenitore.addAttrezzo() --- aggiunto in 2
Contenitore.addAttrezzo() --- aggiunto in 1
*/