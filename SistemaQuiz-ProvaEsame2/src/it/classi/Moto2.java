package it.classi;

public class Moto2 implements Comparable<Moto2> {
	public int cilindrata;
	public String marca;

	public Moto2(String marca, int cilindrata) {
		this.cilindrata = cilindrata;
		this.marca = marca;
	}

	public int compareTo(Moto2 m) {
		return this.marca.compareTo(m.getMarca());
	}

	public int getCilindrata(){
		return this.cilindrata;
	}

	public String getMarca(){
		return this.marca;
	}
}
