package it.classi;

public abstract class X {
	private int a;
	
	public X(int a) {
		this.a = a;
	}
	
	public abstract void m();
	
	public int getA() { return a; }
}
