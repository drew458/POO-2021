package it.classi;

public class Pero2 extends Albero2 {
	public void innesta(Albero2 a) {
		System.out.print("Pero.innesta(Albero) ");
		altezza();
	}

	public void innesta(Pero2 b) {
		System.out.print("Pero.innesta(Pero) ");
		altezza();
	}

	public void altezza() {
		System.out.print("Pero.altezza()");
	}
}
