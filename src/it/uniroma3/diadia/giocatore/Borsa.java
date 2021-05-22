package it.uniroma3.diadia.giocatore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	
	private Map<String, Attrezzo> attrezzi;
	private int pesoMax;
	private int pesoAttuale;
	
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new HashMap<>();
		this.pesoAttuale=0;
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		Attrezzo vecchio = this.attrezzi.put(attrezzo.getNome(), attrezzo);
		if(vecchio != null)
			this.pesoAttuale-=vecchio.getPeso();
		this.pesoAttuale=attrezzo.getPeso();
		return true;
	}
	
	public int getPesoMax() {
		return pesoMax;
	}
	
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		return this.attrezzi.get(nomeAttrezzo);
	}
	
	public int getPeso() {
//		for (String chiave : this.attrezzi.keySet())
//			peso += this.attrezzi.get(chiave).getPeso();
//		for(Map.Entry<String, Attrezzo> entry: this.attrezzi.entrySet())
//			peso+= entry.getValue().getPeso();
		
		return this.pesoAttuale;
	}
	
	public boolean isEmpty() {
		return this.attrezzi.isEmpty();
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.attrezzi.containsKey(nomeAttrezzo);
	}
	
	/**
	 * Rimuove un attrezzo dalla borsa (ricerca in base al nome).
	 * @param nomeAttrezzo
	 * @return l'attrezzo rimosso, null altrimenti
	 */
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		if(this.hasAttrezzo(nomeAttrezzo))
			this.pesoAttuale-=this.getAttrezzo(nomeAttrezzo).getPeso();
		return this.attrezzi.remove(nomeAttrezzo);
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			s.append(this.attrezzi.values().toString());
		}
		else 
			s.append("Borsa vuota");
		return s.toString();
	}
	
	public List<Attrezzo> getContenutoOrdinatoPerPeso(){
		
		List<Attrezzo> attrezziPerPeso=new ArrayList<>(this.attrezzi.values());  //tra <> andrebbe messo Attrezzo ma il compilatore capisce da solo
		Collections.sort(attrezziPerPeso, new ComparatoreAttrezziPerPeso());
		
		return attrezziPerPeso; 
	}
	
	public SortedSet <Attrezzo> getContenutoOrdinatoPerNome(){
		return new TreeSet<Attrezzo>(this.attrezzi.values()) ;
	}
	
}
