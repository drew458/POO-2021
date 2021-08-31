package ex_TreeSet_size;

public class Studente implements Comparable<Studente> {

	private String nome;
    private int eta;
    
    public Studente(String nome, int età) {
        this.nome = nome;
        this.eta = eta;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getEta() {
        return this.eta;
    }
    
    @Override
    public int compareTo(Studente that) {
        return this.getNome().compareTo(that.getNome());
    }
    
    @Override
    public boolean equals(Object o) {
        Studente that = (Studente) o;
        return this.getNome().equals(that.getNome()) && this.getEta() == that.getEta();
    }
}
