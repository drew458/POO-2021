package ex_cambioStringa2;

//Che cosa stampa questo programma?
public class Motocicletta {
	private String targa;

    public Motocicletta(String targa) {
        this.targa = targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return this.targa;
    }

    public static void main(String[] args) {
        Motorizzazione motorizzazione = new Motorizzazione();
        Motocicletta bmw = new Motocicletta("0");
        Motocicletta honda = bmw;

        motorizzazione.cambiaTarga(honda, "2");
        System.out.print(bmw.getTarga());
        System.out.print(" - ");
        System.out.print(honda.getTarga());
    }
}

/*
2 - 2

-----Altre Risposte-----
0 - 2
-
nessuna delle altre
0 - 0
2 - 0
*/