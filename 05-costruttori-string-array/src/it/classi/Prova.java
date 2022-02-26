package it.classi;
public class Prova {
	static void fe(long i) { 
		System.out.println("long");
	}
	
	static void fe(float i) { 
		System.out.println("float");
	}
	
	static void fe(double i) { 
		System.out.println("double"); 
	}
	
	public static void main(String[] args) {
		fe(5); // stampa long
	}
}

