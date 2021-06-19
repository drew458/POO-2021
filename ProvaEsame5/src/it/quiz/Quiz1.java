package it.quiz;

import it.classi.Dimensione;
import it.classi.Larga;
import it.classi.Stretta;

public class Quiz1 {
	public void scrivi(Dimensione r) { 
        System.out.print("Dimensione "); 
    }
    public void scrivi(Larga l) { 
        System.out.print("Larga "); 
    }
    public void scrivi(Stretta s) { 
        System.out.print("Stretta "); 
    }

    public static void main(String args[]) {
      Quiz1  m = new Quiz1();
      Larga l = new Larga();
      Stretta s = new Stretta();
      Dimensione r = new Larga();
      r = s;
      m.scrivi(r);
      m.scrivi(l);
      m.scrivi(s);
    }
}

/**
Dimensione Larga Stretta

Dimensione Dimensione Dimensione
	
Dimensione Larga Larga
	
Stretta Larga Stretta
	
Larga Stretta Larga 
*/
