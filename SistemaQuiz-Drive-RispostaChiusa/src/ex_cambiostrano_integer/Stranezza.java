package ex_cambiostrano_integer;

public class Stranezza {

	@SuppressWarnings("deprecation")
	public int cambioStrano(Integer numero){
        numero = new Integer(3);
        return numero;
    }


    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Stranezza s = new Stranezza();
        Integer valore = new Integer(8);

        System.out.println(valore);
        s.cambioStrano(valore);
        System.out.println(valore);
    }
}

/*
8
8

SPIEGAZIONE
Java passa sempre per VALORE, non per referenza

NOTA BENE
se fosse stato

valore = s.cambioStrano(valore)

oppure

public static int cambioStrano..
e
valore = cambioStrano(valore)

ALLORA STAMPAVA

8
3

-----Risposte Sbagliate-----


nessuna delle altre
	
8
3

3
3
*/