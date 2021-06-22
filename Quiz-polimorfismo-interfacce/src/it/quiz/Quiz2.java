package it.quiz;

import it.classi.A;
import it.classi.D;
import it.classi.Printer;

public class Quiz2 {
	public static void main(String []args){
        D d = new D();
        
        A obj = d.n();
        
        Printer x = new Printer();
        x.print(obj);
     }
}

/*
print(B)-B
print(A)-A
Il codice non compila
print(A)-B
print(B)-A
*/