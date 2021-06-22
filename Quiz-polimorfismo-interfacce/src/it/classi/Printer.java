package it.classi;

public class Printer {
	public void print(A a) {
        System.out.print("print(A)");
        System.out.print("-");
        a.m();
    }
    
    public void print(B b) {
        System.out.print("print(B)");
        System.out.print("-");
        b.m();
    }
}
