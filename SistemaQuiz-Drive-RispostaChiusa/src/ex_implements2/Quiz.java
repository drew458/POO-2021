package ex_implements2;

//Cosa stampa?
public class Quiz {

	public void scrivi(Vegetale v) {
        System.out.print("\nVegetale ");
        v.nonFaNulla();
    }
	
    public void scrivi(Pianta p) {
        System.out.print("\nPianta ");
        p.nonFaNulla();
    }
	
    public void scrivi(Fungo f) {
        System.out.print("\nFungo ");
        f.nonFaNulla();
    }

    public static void main(String args[]) {
      Quiz quiz = new Quiz();
      Pianta p = new Pianta();
      Fungo f = new Fungo();
      Vegetale v = new Pianta();
      v=f;
	  
      quiz.scrivi(v);
      quiz.scrivi(p);
      quiz.scrivi(f);
    }
}

/*
Vegetale
VENGO DA FUNGO

Pianta
VENGO DA PIANTA

Fungo
VENGO DA FUNGO

SPIEGAZIONE
quiz.scrivi(STATICO)
DINAMICO.nonFaNulla();
*/
