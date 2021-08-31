package ex_extends_super_messaggio;

public class Quiz {

	public static void main(String[] args) {
		Messaggio mail = new Mail("a@jmail.com", "x@kmail.com");

		Messaggio post = new Post("Mario Rossi");

		Messaggio msg = new Messaggio();

		System.out.println(mail.getLunghezzaMassima());
		System.out.println(msg.getLunghezzaMassima());
		System.out.println(post.getLunghezzaMassima());
	}
}

/*
1024
1024
255

SPIEGAZIONE

mail.getLunghezzaMassima()
MESSAGGIO.getLunghezzaMassima() -> perche' Mail non ha il metodo getLunghezzaMassima
LUNGHEZZA_MAX_DEFAULT = 1024 	-> SI STAMPA 1024

msg.getLunghezzaMassima()
MESSAGGIO.getLunghezzaMassima()
LUNGHEZZA_MAX_DEFAULT = 1024 	-> SI STAMPA 1024

post.getLunghezzaMassima()
LUNGHEZZA_MAX_POST = 255 		-> viene passata nella classe super() <-> Messaggio()
								-> SI STAMPA 255


------Risposte sbagliate------

1024
0
1024

0
1024
255



0
1024
0

Il codice non compila
*/