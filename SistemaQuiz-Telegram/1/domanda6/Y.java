package domanda6;

class X {
	public void dim(X x) {
		System.out.println("X.dim(X) ");
	}
	public void dim(Y y) {
		System.out.println("X.dim(Y) ");
	}
	public void dim(Z z) {
		System.out.println("X.dim(Z) ");
	}
}

class Z extends X {
	public void dim(X x) {
		System.out.println("Z.dim(X) ");
	}
	public void dim(Y y) {
		System.out.println("Z.dim(Y) ");
	}
	public void dim(Z z) {
		System.out.println("Z.dim(Z) ");
	}
}

public class Y extends X {
	public void dim(X x) {
		System.out.println("Y.dim(X) ");
	}

	public void dim(Y y) {
		System.out.println("Y.dim(Y) ");
	}
	public void dim(Z z) {
		System.out.println("Y.dim(Z) ");
	}
	public static void main(String args[]) {
		X a = new Z();
		Y b = new Y();
		a.dim(b);
		Y a1 = new Y();
		a1.dim(a);
	}
}
