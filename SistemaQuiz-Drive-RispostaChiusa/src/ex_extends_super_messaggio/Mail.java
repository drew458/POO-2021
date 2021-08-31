package ex_extends_super_messaggio;

public class Mail extends Messaggio {

	private String mittente;
	private String destinatario;

	public Mail(String mittente, String destinatario) {
		super();
		this.mittente = mittente;
		this.destinatario = destinatario;
	}
}
