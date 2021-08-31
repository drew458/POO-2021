package ex_TreeMap_update;

import java.util.Map;
import java.util.TreeMap;

//Cosa stampa?
public class VerificaMappe {

	public static void main(String[] argc) {
        Map mappa = new TreeMap();

        int i = 1;

        mappa.put("Luca",i);
        System.out.println(mappa);

        mappa.put("Anna",i);
        System.out.println(mappa);

        i = 50;
        mappa.put("Antonio",i);
        System.out.println(mappa);

        i = 30;
        mappa.put("Anna", i);
        System.out.println(mappa);
    }
}

/*
Il programma stampa:

{Luca=1}
{Anna=1, Luca=1}
{Anna=1, Antonio=50, Luca=1}
{Anna=30, Antonio=50, Luca=1}

SPIEGAZIONE
Ogni volta che si aggiunge un elemento sulla mappa si scrive una nuova riga.
Se un valore viene aggiornato si cambia semplicemente il valore precedente.

-----Risposte sbagliate-----

Il programma stampa:

{Luca=1}
{Anna=1}
{Anna=1}
{Anna=1}

Il programma stampa:

{Luca=1}
{Anna=1, Anna=1}
{Anna=1, Anna=50, Anna=1}
{Anna=30, Anna=50, Anna=1}

Il programma stampa:

{Luca=1}
{Luca=1, Luca=1}
{Luca=1, Luca=50, Luca=1}
{Luca=30, Luca=50, Luca=1}
*/