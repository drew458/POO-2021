package mappe;

import java.util.HashMap;

/*
Scrivere il metodo getStudente2voto() della classe OperazioniStudenti. Tale metodo riceve in input due mappe.
La prima mappa, mat2stud, associa una matricola di tipo String ad un oggetto di tipo Studente.
La seconda, mat2voto, associa una matricola di tipo String ad un voto.
Il metodo deve restituire una mappa che associa gli studenti della prima mappa ai voti della seconda mappa
usando la corrispondenza fra matricole (le chiavi delle mappe).
E' possibile che per certi studenti non siano riportati i voti. In quel caso lo studente non deve comparire nella mappa in output.
*/

import java.util.Map;

class Studente {
	// NON MODIFICARE QUESTA CLASSE
	private String matricola;
	private int eta;
	
	public Studente(String matricola, int eta) {
		this.matricola = matricola;
		this.eta = eta;
	}
	
	// La matricola e' univoca
	public String getMatricola() { return matricola; }
	
	public int getEta() { return eta; }
	
	// NON MODIFICARE QUESTA CLASSE
	@Override
	public int hashCode() { return this.matricola.hashCode(); }
	
	public boolean equals(Object o){
		Studente s = (Studente)o;
		return this.getMatricola().equals(s.getMatricola());		
	}
	//NON MODIFICARE QUESTA CLASSE
}
	
public class OperazioniStudenti {
		
	public Map<Studente, Integer> getStudente2voto(Map<String, Studente> mat2stud, Map<String, Integer> mat2voto){
		Map<Studente, Integer> stud2voto = new HashMap<>();
		for(String matricola : mat2voto.keySet()) { // L'insieme delle chiavi e' lo stesso per le due mappe
			Studente studente = mat2stud.get(matricola);
			Integer voto = mat2voto.get(matricola);
			
			if(voto!=null)
				stud2voto.put(studente,voto);
		}
		return stud2voto;
	}
}
