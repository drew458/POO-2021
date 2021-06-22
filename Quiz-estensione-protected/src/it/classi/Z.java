package it.classi;

public class Z extends X {
	public void dim(X x) {
		System.out.print("Z.dim(X)");
	}
	public void dim(Y y) {
		System.out.print("Z.dim(Y)");
	}
	public void dim(Z z) {
		System.out.print("Z.dim(Z)");
	}
}
