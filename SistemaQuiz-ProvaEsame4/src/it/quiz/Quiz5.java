package it.quiz;

import it.classi.Giocoliere;
import it.classi.MaestroGiocoliere;

public class Quiz5 {
	public static void main(String[] args) {
        MaestroGiocoliere maestro = new MaestroGiocoliere();
        Giocoliere leonardo = new Giocoliere("Palline");
        Giocoliere alessio = leonardo;

        System.out.print(alessio.getAttrezzo()+" ");
        System.out.print(leonardo.getAttrezzo()+" ");
        System.out.print("- ");

        maestro.assegnaAttrezzo(alessio, "Cerchi");
        System.out.print(alessio.getAttrezzo()+" ");
        System.out.print(leonardo.getAttrezzo()+" ");
        System.out.print("- ");

        maestro.assegnaAttrezzo(leonardo, "Clave");
        System.out.print(alessio.getAttrezzo()+" ");
        System.out.print(leonardo.getAttrezzo()+" ");
    }
}
