package it.classi;

public class Y extends X {
	public void dim(X x) {
		System.out.print("Y.dim(X)");
	}
	public void dim(Y y) {
		System.out.print("Y.dim(Y)");
	}
	public void dim(Z z) {
		System.out.print("Y.dim(Z)");
	}
	
	public static void main(String args[]) {
		X a = new Z();
		Y b = new Y();
		a.dim(b);
		Y a1 = new Y();
		System.out.print(" - ");
		a1.dim(a);
	}
}

/*
Z.dim(Y) - Y.dim(X)
X.dim(Y) - Y.dim(X)
Z.dim(Y) - Y.dim(Z)
X.dim(Y) - Y.dim(Z)
nessuna delle altre
X.dim(X) - X.dim(X)
*/

/*
La risposta giusta è Z.dim(Y) - Y.dim(X) perche a a1.dim(a) viene passato il tipo statico X
*/