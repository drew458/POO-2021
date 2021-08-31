package it.classi;

public class Albero2 {
	public void innesta(Albero2 a) {
		System.out.print("Albero.innesta(Albero) ");
		altezza();
        }

        public void innesta(Pero2 b) {
		System.out.print("Albero.innesta(Pero) ");
		altezza();
	}

        public void altezza() {
		System.out.print("Albero.altezza()");
	}
}
