package it.classi;

public class Y extends X {
	private int b;
	
	public Y(int a, int b) {
		super(a/3);
		this.b = b;
	}
	
	@Override
	public void m() {
		System.out.println(this.getA());
		System.out.println("/");
		System.out.println(this.b);
	}
}
