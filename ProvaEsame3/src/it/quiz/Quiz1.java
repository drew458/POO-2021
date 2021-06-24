package it.quiz;

import it.classi.Auto;
import it.classi.Coupe;
import it.classi.Utilitaria;

public class Quiz1 {
	public void mostra(Auto a) {
        System.out.print("Auto ");
    }
    public void mostra(Utilitaria u) {
        System.out.print("Utilitaria ");
    }
    public void mostra(Coupe c) {
        System.out.print("Coupe ");
    }

    public static void main(String args[]) {
      Quiz1 q = new Quiz1();
      Utilitaria u = new Utilitaria();
      Coupe c = new Coupe();
      Auto a = new Utilitaria();
      a = c;
      q.mostra(c);
      q.mostra(a);
      q.mostra(u);
    }
}

/*
 * coupe auto utilitaria 
 * 
*/