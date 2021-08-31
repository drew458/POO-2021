package it.quiz;

import it.classi.Computer;
import it.classi.Laptop;

public class Quiz6 {
	public static void main(String args[]) {

		Computer a = new Laptop();
		Computer b = new Computer();
		a.dimensioni(b);
	}
}

/*
	
Il programma stampa: Laptop.dimensioni(Computer) Laptop.fine()
	
Il programma stampa: Computer.dimensioni(Computer) Laptop.fine()
	
Il programma stampa: Laptop.dimensioni(Laptop) Computer.fine()
	
Il programma stampa: Laptop.dimensioni(Computer) Computer.fine()
	
Il programma stampa: Computer.dimensioni(Laptop) Computer.fine()
	
Il programma stampa: Computer.dimensioni(Computer) Computer.fine()
*/
