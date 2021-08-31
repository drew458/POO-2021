package ex_extends_super_messaggio;

public class Post extends Messaggio {

	private static final int LUNGHEZZA_MAX_POST = 255;
	private String user;
	private String[] tags;

	public Post(String user) {
		super(LUNGHEZZA_MAX_POST);
		this.user = user;
		this.tags = new String[10];
	}
}
