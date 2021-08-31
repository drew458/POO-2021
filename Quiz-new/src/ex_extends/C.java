package ex_extends;

public class C extends A {
	public void dim(A a) {
        System.out.println("C.dim(A) ");
    }
    public void dim(B b) {
        System.out.println("C.dim(B) ");
    }
    public void dim(C c) {
        System.out.println("C.dim(C) ");
    }
}
