package it.classi;

public class Vespa extends Scooter2 {
	public void tipo(Scooter2 a) {
	    System.out.print("Vespa.tipo(Scooter) ");
	    costo();
        }

        public void tipo(Vespa b) {
	    System.out.print("Vespa.tipo(Vespa) ");
  	    costo();
        }

        public void costo() {
	    System.out.print("Vespa.costo()");
        }
}
