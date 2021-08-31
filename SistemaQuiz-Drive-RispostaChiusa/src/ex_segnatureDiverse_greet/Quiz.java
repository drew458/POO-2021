package ex_segnatureDiverse_greet;

//Cosa fa il seguente programma?
public class Quiz {

	public static void main(String[] args) {
        K a = new J();
        J b = new J();
    
        a.me();
        a.greet(b);
        a.greet(a);
    }
}

/*
J
greet(K)
greet(K)

a.me()      <-> J.me() perche il metodo me è sovrascritto
a.greet(b)  <-> K.greet(J) perche' il metodo non e' sovrascritto
a.greet(a)  <-> K.greet(K) vedi sopra


--------Risposte Sbagliate---------

J
greet(J)
greet(K)

K
greet(J)
greet(K)

K
greet(J)
greet(J)

il codice non compila
*/