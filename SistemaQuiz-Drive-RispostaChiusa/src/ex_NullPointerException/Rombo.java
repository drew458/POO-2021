package ex_NullPointerException;

//Cosa stampa questo codice?
public class Rombo {

	private Punto coordinate;
    private int diagonaleMaggiore;
    private int diagonaleMinore;
    
    public Rombo(int diagMaggiore, int diagMinore) {
        this.diagonaleMaggiore = diagMaggiore;
        this.diagonaleMinore = diagMinore;
    }
    
    public void setcoordinate(int x, int y) {
        Punto p = new Punto(x, y);
        this.coordinate = p;
    }
    
    public int getDiagonaleMaggiore() {
        return this.diagonaleMaggiore;
    }
    
    public int getDiagonaleMinore() {
        return this.diagonaleMinore;
    }
    
    public Punto getCoordinate() {
        return this.coordinate;
    }
    
    public String toString() {
        return this.diagonaleMaggiore + " - " + this.diagonaleMinore;
    }
    
    public static void main(String[] args) {
        Rombo rombo = new Rombo(20, 10);
        System.out.println(rombo.getCoordinate().toString());
    }
}

/*
viene sollevato un NullPointerException

Le coordinate non sono state inizializzate o settate, quindi puntano null

----------Risposte Sbagliate----------

il codice non compila
nessuna delle altre
null
20 - 10
*/
