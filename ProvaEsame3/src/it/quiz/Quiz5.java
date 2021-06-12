package it.quiz;

import it.classi.Aula;
import it.classi.Portineria;

public class Quiz5 {
	public static void main(String[] args) {
        Portineria segreteria = new Portineria();
        Aula piccola = new Aula(40);
        Aula grande = piccola;

        System.out.print(grande.getCapienza()+" ");
        System.out.print(piccola.getCapienza()+" ");
        System.out.print(". ");

        segreteria.cambiaCapienza(grande, 70);
        System.out.print(grande.getCapienza()+" ");
        System.out.print(piccola.getCapienza()+" ");
        System.out.print(". ");

        segreteria.cambiaCapienza(piccola, 60);
        System.out.print(grande.getCapienza()+" ");
        System.out.print(piccola.getCapienza()+" ");
    }
}

/* Il programma stampa: 40 40 . 70 70 . 60 60

* Il programma stampa: 40 40 . 40 40 . 40 40

* Il programma stampa: 40 40 . 70 40 . 40 60

* Il programma stampa: 40 40 . 40 70 . 60 40

* Il programma stampa: 0 40 . 70 40 . 70 60

* Il programma stampa: 40 40 . 40 60 . 40 40

* Il programma stampa: 60 60 . 60 60 . 60 60 */