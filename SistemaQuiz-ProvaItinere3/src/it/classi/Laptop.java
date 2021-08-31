package it.classi;

public class Laptop extends Computer {
	public void dimensioni(Computer a) {
		System.out.println("Laptop.dimensioni(Computer) ");
		fine();
	}
	
	public void dimensioni(Laptop b) {
		System.out.println("Laptop.dimensioni(Laptop) ");
		fine();
	}
	
	public void fine() {
		System.out.println("Laptop.fine()");
	}
}
