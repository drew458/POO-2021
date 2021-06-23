package it.classi;

public class ProvaRisoluzioneMetodi {
	void f(long i) { System.out.println("long"); }
	void f(float i) { System.out.println("float"); }
	void f(double i) { System.out.println("double"); }
	public static void main(String[] args) {
		ProvaRisoluzioneMetodi prova = new ProvaRisoluzioneMetodi();
		prova.f(5); // ???
	}
}
