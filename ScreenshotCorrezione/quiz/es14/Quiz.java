package es14;

/* Cosa stampa questo programma */

class J {
	public void m() {
		System.out.println("J");
	}
}

class K extends J {
	public void m() {
		System.out.println("K");
	}
}

class C {
	protected J n() {
		return new J();
	}
}

class D extends C {
	public K n() {
		return new K();
	}
}

class X {
	public void print(J a) {
		System.out.println("print(K)");
		System.out.println("-");
		a.m();
	}
	
	public void print(K b) {
		System.out.println("print(J)");
		System.out.println("-");
		b.m();
	}
}

public class Quiz {

	public static void main(String[] args) {
		D d = new D();
		
		J obj = d.n();
		
		X x = new X();
		x.print(obj);
	}
}

/*
 * print(K)
 * -
 * K  
 */