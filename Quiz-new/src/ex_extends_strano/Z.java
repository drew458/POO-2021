package ex_extends_strano;

public class Z {

	public void print(X a) {
		System.out.print("print(X)");
		System.out.print(" - ");
		a.m();
	}
	public void print(Y b) {
		System.out.print("print(Y)" );
		System.out.print("-");
		b.m();
	}
}
