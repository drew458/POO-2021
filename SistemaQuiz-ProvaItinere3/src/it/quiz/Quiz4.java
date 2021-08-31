package it.quiz;

import it.classi.Computer;
import it.classi.Laptop;

public class Quiz4 {
	public static void main(String[] args) {
		Computer a = new Laptop();
		Computer b = new Computer();
		a.dimensioni(b);
	}
}

/**
 * - laptop.dimensioni(computer) laptop.fine()
 * computer.dimensioni(computer) laptop.fine()
 * laptop.dimensioni(laptop) computer.fine()
 * laptop.dimensioni(computer) computer.fine()
 * computer.dimensioni(laptop) computer.fine()
 * computer.dimensioni(computer) computer.fine()
*/
