package it.quiz;

import java.util.ArrayList;
import java.util.List;

import it.classi.AutoSnodato;
import it.classi.Camion;
import it.classi.MezzoDiTrasporto;
import it.classi.Treno;

public class Quiz3 {
	public static void main(String args[]) {
        List<MezzoDiTrasporto> mezziDiTrasporto = new ArrayList<MezzoDiTrasporto>();

        MezzoDiTrasporto mezzo = null;
        Camion camion = new Camion();
        MezzoDiTrasporto treno = new Treno();
        Camion as = new AutoSnodato();
        AutoSnodato autosnodato = new AutoSnodato();

        mezzo = autosnodato;
        mezziDiTrasporto.add(mezzo);
        mezzo = camion;
        mezziDiTrasporto.add(mezzo);
        mezzo = treno;
        mezziDiTrasporto.add(mezzo);
        mezzo = as;
        mezziDiTrasporto.add(mezzo);

        for(MezzoDiTrasporto mezzoDiTrasporto : mezziDiTrasporto)
            System.out.print(mezzoDiTrasporto.tipo()+" ");
    }
}


/* - Il programma stampa: autosnodato camion treno autosnodato

* Il programma stampa: autosnodato camion treno camion

* Il programma stampa: ... ... ... ...

* Il programma stampa: camion treno camion camion

* Il programma stampa: autosnodato camion treno ... */