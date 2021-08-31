package ex_extends_abstract;

//Che cosa stampa il seguente programma?
public class Quiz {
	public static void main(String[] args) {
		A obj = new Y();
		obj.b();
	}
}

/*
A.b
Y.a
A.c
Y.b

SPIEGAZIONE
obj:
statico A
dinamico Y

obj.b() <-> Y.b()

super.b() <-> A.b() si va nel metodo implementato in A

SI STAMPA
A.b

a() -> si va nel metodo implementato in Y

SI STAMPA
Y.a

c() -> si va nel metodo implementato in A

SI STAMPA
A.c

si ritorna nel metodo b() in Y
 
SI STAMPA
Y.b

-----Risposte Sbagliate-----

A.b
A.c
Y.a
Y.b

Il codice non compila

A.b
A.c
A.a
Y.b

Y.b
Y.a
A.c
A.b
*/