package domanda9;

class Z {

	public void me(){
		System.out.println("Z");
	}

	public void greet(Z z) {
		System.out.println("greet(Z)");
	}

}

class V extends Z {
	@Override
	public void me(){
		System.out.println("V");
	}

	public void greet(V v) {
		System.out.println("greet(V)");
	} 

}

public class Quiz {
	public static void main (String[] args) {
		Z a = new V();
		V b = new V();

		a.me();
		a.greet(b);
		a.greet(a);
	}

}


