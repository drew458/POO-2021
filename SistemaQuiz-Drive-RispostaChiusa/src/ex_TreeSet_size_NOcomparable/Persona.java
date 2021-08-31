package ex_TreeSet_size_NOcomparable;

public class Persona implements Comparable {

private String nome;
    
    private int eta;
    
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public String getNome() { return this.nome; }
    public int getEta()     { return this.eta;  }
    
    @Override
    public int compareTo(Persona that) {
        return this.getNome().compareTo(that.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        Persona that = (Persona) o;
        return this.getNome().equals(that.getNome()) && this.getEta()==that.getEta();
    }
}

/*
Il codice non compila

SPIEGAZIONE

La classe Persona e' si estesa con Comparable ma a Comparable manca il TIPO!
Comparable<Persona> e non Comparable senza NULLA.

-----Risposte sbagliate-----

4
2
3
1
*/