package it.classi;

public class Computer {
	public void dimensioni(Computer a) {
		System.out.println("Computer.dimensioni(Computer) ");
		fine();
	}
	
	public void dimensioni(Laptop b) {
		System.out.println("Computer.dimensioni(Laptop) ");
		fine();
	}
	
	public void fine() {
		System.out.println("Computer.fine()");
	}
}
