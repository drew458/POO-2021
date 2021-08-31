package it.classi;

public class Y2 extends X{
private int b;
    
    public Y2(int a, int b) {
        super(a/3);
        this.b = b;
    }
    
    @Override
    public void m() {
        System.out.print(this.getA());
        System.out.print("/");
        System.out.print(this.b);
    }
}
