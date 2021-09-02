package ex_extends;

//Cosa stampa il seguente programma?
public class B extends A {
	public void dim(A a) {
		System.out.println("B.dim(A) ");
	}
	public void dim(B b) {
		System.out.println("B.dim(B) ");
	}
	public void dim(C c) {
		System.out.println("B.dim(C) ");
	}
	public static void main(String args[]) {
		A a = new C();
		B b = new B();
		a.dim(b);
		B al = new B();
		al.dim(a);
	}
}

/*
C.dim(B)
B.dim(A)

A e' estesa da B e C, queste due hanno gli stessi dim di A.
Basta quindi prendere
TIPODINAMICO.dim(TIPOSTATICO)

-----------Altre Risposte-----------

nessuna delle altre

A.dim(B)
B.dim(C)

A.dim(B)
B.dim(A)

C.dim(B)
B.dim(C)

A.dim(A)
A.dim(A)
*/