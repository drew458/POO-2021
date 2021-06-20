package it.quiz;

import it.classi.Auto3;
import it.classi.Officina;

public class Quiz5 {
	public static void main(String[] args) {
        Officina officina = new Officina();
        Auto3 piccola = new Auto3(2000);
        Auto3 grande = piccola;

        System.out.print(grande.getCilindrata()+" ");
        System.out.print(piccola.getCilindrata()+" ");
        System.out.print(". ");

        officina.cambiaCilindrata(grande, 1500);
        System.out.print(grande.getCilindrata()+" ");
        System.out.print(piccola.getCilindrata()+" ");
        System.out.print(". ");

        officina.cambiaCilindrata(piccola, 1000);
        System.out.print(grande.getCilindrata()+" ");
        System.out.print(piccola.getCilindrata()+" ");
    }
}

/*
Il programma stampa: 2000 2000 . 1500 1500 . 1000 1000

Il programma stampa: 2000 2000 . 2000 2000 . 2000 2000

Il programma stampa: 2000 2000 . 1500 1500 . 1500 1000

Il programma stampa: 2000 2000 . 1500 1500 . 1000 1500

Il programma stampa: 0 1500 . 2000 1500 . 2000 1000

Il programma stampa: 1000 1000 . 1000 1000 . 1000 1000
*/