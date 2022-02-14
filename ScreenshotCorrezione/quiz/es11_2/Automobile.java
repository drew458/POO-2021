package es11_2;

/* Cosa stampa il seguente programma? */

public class Automobile {
	private int anno;
	private String targa;
	
	public Automobile(String targa, int anno) {
		this.targa = targa;
		this.anno = anno;
	}
	
	public void cambioTarga(String targa) {
		this.targa = targa;
	}
	
	public String toString() {
		return this.targa + " - " + this.anno;
	}
	
	public static void main(String[] args) {
		Automobile a1 = new Automobile("1111", 99);
		Automobile a2 = new Automobile("2222", 02);
		Automobile a3 = a1;
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		a2 = a3;
		a2.cambioTarga("3333");
		
		System.out.println(a2.toString());
		System.out.println(a3.toString());
	}
}

/* 1111 - 99
 * 2222 - 2
 * 3333 - 99
 * 3333 - 99
*/
