package it.quiz;

import java.util.ArrayList;
import java.util.List;

import it.classi.Auto;
import it.classi.MotoVeicolo;
import it.classi.Sidecar;
import it.classi.Veicolo;

public class Quiz3 {
	public static void main(String args[]) {
        List<Veicolo> mezziDiTrasporto = new ArrayList<Veicolo>();

        Veicolo v = null;
        MotoVeicolo moto = new MotoVeicolo();
        Veicolo auto = new Auto();
        MotoVeicolo motoSidecar = new Sidecar();
        Sidecar sidecar = new Sidecar();

        v = auto;
        mezziDiTrasporto.add(v);
        v = motoSidecar;
        mezziDiTrasporto.add(v);
        v = moto;
        mezziDiTrasporto.add(v);
        v = sidecar;
        mezziDiTrasporto.add(v);

        for(Veicolo mezzoDiTrasporto : mezziDiTrasporto)
            System.out.print(mezzoDiTrasporto.ruote()+" ");
    }
}
