package it.classi;

public class Auto3 implements Comparable<Auto3> {
	public int cilindrata;
	public String marca;

	public Auto3(String marca, int cilindrata) {
		this.cilindrata = cilindrata;
		this.marca = marca;
	}

	public int compareTo(Auto3 a) {
		return this.marca.compareTo(a.getMarca());
	}

	public int getCilindrata(){
		return this.cilindrata;
	}

	public String getMarca(){
		return this.marca;
	}
}
