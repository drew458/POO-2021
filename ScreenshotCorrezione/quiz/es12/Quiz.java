package es12;

/* Cosa stampa il seguente programma? */

class Lavoratore extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=2; i++) 
			System.out.println(i+" lavora");
	}
}

public class Quiz {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("1 pensa");
		
		Thread t = new Lavoratore();
		
		System.out.println("2 pensa");
		
		t.start();
		t.join();
		
		System.out.println("3 pensa");
	}
}

/* 1 pensa
 * 2 pensa
 * 1 lavora
 * 2 lavora
 * 3 pensa
*/