package it.quiz;

import it.classi.Ladro;
import it.classi.Macchina;

public class Quiz5 {
	public static void main(String[] args) {
        Ladro ladro = new Ladro();
        Macchina alfa = new Macchina(5);
        Macchina fiat = alfa;

        System.out.print(fiat.getTarga()+" ");
        System.out.print(alfa.getTarga()+" ");
        System.out.print("- ");

        ladro.cambiaTarga(fiat, 3);
        System.out.print(fiat.getTarga()+" ");
        System.out.print(alfa.getTarga()+" ");
        System.out.print("- ");

        ladro.cambiaTarga(alfa, 2);
        System.out.print(fiat.getTarga()+" ");
        System.out.print(alfa.getTarga()+" ");
    }
}

/*
Il programma stampa: 5 5 - 3 3 - 2 2
	
Il programma stampa: 5 5 - 5 5 - 5 5
	
Il programma stampa: 5 5 - 3 5 - 5 2
	
Il programma stampa: 5 5 - 5 3 - 2 5
	
Il programma stampa: 0 5 - 3 5 - 3 2
	
Il programma stampa: 5 5 - 5 5 - 2 2
*/
