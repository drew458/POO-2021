package domanda10;

class Messaggio {

	private static final int LUNGHEZZA_MAX_DEFAULT = 1024;
	private int lunghezzaMassima;

	public Messaggio(int lunghezzaMassima) {
		this.lunghezzaMassima = lunghezzaMassima;
	}

	public Messaggio() {
		this(LUNGHEZZA_MAX_DEFAULT);
	}

	public int getLunghezzaMassima() {
		return lunghezzaMassima;
	}

}

class Mail extends Messaggio {

	private String mittente;
	private String destinatario;

	public Mail(String mittente, String destinatario) {
		super();
		this.mittente = mittente;
		this.destinatario = destinatario;
	}
}

class Post extends Messaggio {

	private static final int LUNGHEZZA_MAX_POST = 255;
	private String user;
	private String[] tags;

	public Post(String user) {
		super(LUNGHEZZA_MAX_POST);
		this.user = user;
		this.tags = new String[10];
	}    
}

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
 * 1024
 * 1024
 * 255 
*/