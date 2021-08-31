package ex_extends_segnatureDiverse_attrezzi2;

public class Contenitore {

	private Attrezzo[] attrezzi;

	public Contenitore() {
		this.attrezzi = new Attrezzo[5];
	}

	public void addAttrezzo(Attrezzo a, int i) 
	{
		this.attrezzi[i] = a;
		System.out.println("Attrezzo aggiunto in "+i);
	}
	public Attrezzo[] getAttrezzi() {
		return this.attrezzi;
	}
}
