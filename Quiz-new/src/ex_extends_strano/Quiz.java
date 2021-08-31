package ex_extends_strano;

//Che cosa stampa?
public class Quiz {

	public static void main(String[] args) {
		B d = new B();
		X obj = d.n();
		Z z = new Z();
		z.print(obj);

	}
}

/*
print(X) - Y

SPIEGAZIONE
X e' estesa da Y
A e' estesa da B
Z e' a parte

X e Y hanno il metodo m() con stessa signatura
A e B hanno due metodi distinti con signatura diversa

X obj = d.n()
X obj = B.n()

Si va in B, il metodo n() ritorna new Y()

X obj = new Y()

z.print(obj)
Z.print(X)

Si va in Z
SI STAMPA print(X) - 

a.m()
Y.m() SI PRENDE IL TIPO DINAMICO DI obj, cioe Y

SI STAMPA Y
*/