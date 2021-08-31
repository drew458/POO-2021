package ex_implements;

//Cosa stampa questo programma:
public class Quiz {

	public void scrivi(Strumento a) {
        System.out.print("Strumento ");
    }
    
    public void scrivi(Oboe b) {
        System.out.print("Oboe ");
    }
    
    public void scrivi(Sitar c) {
        System.out.print("Sitar ");
    }
    
    public static void main(String args[]) {
        Quiz m = new Quiz();
        Oboe g = new Oboe();
        Sitar c = new Sitar();
        Strumento s = new Oboe();
        s = c;
        
        m.scrivi(s);
        m.scrivi(c);
        m.scrivi(g);
    }
}

/*
Strumento Sitar Oboe

m.scrivi(STATICO)

m.scrivi(s) <-> m.scrivi(Strumento) STAMPA Strumento
m.scrivi(c) <-> m.scrivi(Sitar)     STAMPA Sitar
m.scrivi(g) <-> m.scrivi(Oboe)      STAMPA Oboe

------Altre Risposte------

Strumento Strumento Oboe
Strumento Strumento Strumento
Oboe Sitar Oboe
Sitar Sitar Strumento
*/
