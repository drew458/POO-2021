package domanda8;

class J {
	public void m() {
		System.out.println("J");
	}
}

class K extends J {
	@Override
	public void m() {
		System.out.println("K");
	}
}

class C {
	protected J n() {
		return new J();
	}
}

class D extends C {
	@Override
	public K n() {
		return new K();
	}
}

class X {
	public void print(J a) {
		System.out.println("print(J)");
		a.m();
	}

	public void print(K b) {
		System.out.println("print(K)");
		b.m();
	}
}


public class Quiz{

	public static void main(String[] args){
		D d = new D();

		J obj = d.n();

		X x = new X();
		x.print(obj);
	}
}
