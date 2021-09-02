package ex_extends_abstract;

public class Y extends A {

	@Override
	public void a() {
		System.out.println("Y.a");
		c();
	}

	@Override
	public void b() {
		super.b();
		System.out.println("Y.b");
	}

}
