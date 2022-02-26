package it.classi;

public class Boo {

	void f(String n) {
		System.out.println("stringa");
	}
	void f(int n) {
		System.out.println("intero");
	}
	public static void main(String[] args) {
		Boo b = new Boo();
		String s = new String("pppp");
		int i = 0;
		b.f(s);
		b.f(i);
		
		//stampa stringa, intero
	}
}
