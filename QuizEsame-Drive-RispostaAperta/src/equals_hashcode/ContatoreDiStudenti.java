package equals_hashcode;

import java.util.HashSet;

/*
Senza cambiare il codice della classe ContatoreDiStudenti,
completare i metodi equals() ed hashCode() della classe Studente affinche'
il metodo contaMatricoleDellInsieme() della classe ContatoreDiStudenti restituisca
il numero di oggetti istanza della classe Studente che nell'insieme passatogli
come parametro possiedono matricole distinte.
*/
class Studente {

    private String matricola;
    private String nome;

    Studente(String matricola, String nome) {
        this.matricola = matricola;
        this.nome = nome;
    }

    public String getMatricola() {
        return this.matricola;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean equals(Object o) {
        Studente that = (Studente) o;
        return this.getNome().equals(that.getNome()) && this.getMatricola().equals(that.getMatricola());
    }

    public int hashCode() {
        return this.getNome().hashCode() + this.getMatricola().hashCode();
        
    }
}

public class ContatoreDiStudenti {
    //NON toccare questa classe
    public int contaMatricoleDellInsieme(HashSet<Studente> insieme) {
        return insieme.size();
    }
    //NON toccare questa classe
}
