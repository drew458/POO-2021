package it.classi;

public class ProvaRisoluzioneMetodi2 {
	void f(long i) { System.out.println("long"); }
	void f(double i) { System.out.println("double"); }
	public static void main(String[] args) {
		ProvaRisoluzioneMetodi2 prova = new ProvaRisoluzioneMetodi2();
		prova.f(5); // ???
		prova.f(5f); // ???
	}
}
