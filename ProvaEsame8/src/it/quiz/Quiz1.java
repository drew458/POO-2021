package it.quiz;

import it.classi.Fungo;
import it.classi.Pianta;
import it.classi.Vegetale;

public class Quiz1 {
	public void scrivi(Vegetale v) {
        System.out.print("Vegetale ");
    }
    public void scrivi(Pianta p) {
        System.out.print("Pianta ");
    }
    public void scrivi(Fungo f) {
        System.out.print("Fungo ");
    }

    public static void main(String args[]) {
      Quiz1 quiz = new Quiz1();
      Pianta p = new Pianta();
      Fungo f = new Fungo();
      Vegetale v = new Pianta();
      v = f;
      quiz.scrivi(v);
      quiz.scrivi(p);
      quiz.scrivi(f);
    }
}

/*
Vegetale Pianta Fungo

Fungo Pianta Fungo
	
Vegetale Vegetale Vegetale
	
Pianta Pianta Fungo
	
Fungo Pianta Vegetale
*/