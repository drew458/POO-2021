package contatori;

public class ContaOmonimiDi {
	/*
	Scrivere il codice del metodo public int contaOmonimiDi(String nome) affinche'
	restituisca il numero di nomi dell'array nomi che sono uguali alla stringa nome passata come parametro.
	*/

	public class Persone {
	    private String[] nomi;

	    public Persone(int n) {
	        this.nomi = new String[n];
	    }

	    public int contaOmonimiDi(String nome) {
	    	int cont=0;
	        for(int i=0; i<this.nomi.length; i++) {
	        	if(nomi[i].equals(nome))
	        		cont++;
	        }
	        return cont;
	    }

	    public void aggiungiNome(int indice, String nome){
	        this.nomi[indice] = nome;
	    }
	}
}
