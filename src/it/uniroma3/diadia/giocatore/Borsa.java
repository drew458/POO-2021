package it.uniroma3.diadia.giocatore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	
	private Map<String, Attrezzo> nome2attrezzo;
	private int pesoMax;
	private int pesoAttuale;
	
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.nome2attrezzo = new HashMap<>();
		this.pesoAttuale=0;
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		Attrezzo vecchio = this.nome2attrezzo.put(attrezzo.getNome(), attrezzo);
		if(vecchio != null)
			this.pesoAttuale-=vecchio.getPeso();
		this.pesoAttuale=attrezzo.getPeso();
		return true;
	}
	
	public int getPesoMax() {
		return pesoMax;
	}
	
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		return this.nome2attrezzo.get(nomeAttrezzo);
	}
	
	public int getPeso() {
//		for (String chiave : this.attrezzi.keySet())
//			peso += this.attrezzi.get(chiave).getPeso();
//		for(Map.Entry<String, Attrezzo> entry: this.attrezzi.entrySet())
//			peso+= entry.getValue().getPeso();
		
		return this.pesoAttuale;
	}
	
	public boolean isEmpty() {
		return this.nome2attrezzo.isEmpty();
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.nome2attrezzo.containsKey(nomeAttrezzo);
	}
	
	/**
	 * Rimuove un attrezzo dalla borsa (ricerca in base al nome).
	 * @param nomeAttrezzo
	 * @return l'attrezzo rimosso, null altrimenti
	 */
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		if(this.hasAttrezzo(nomeAttrezzo))
			this.pesoAttuale-=this.getAttrezzo(nomeAttrezzo).getPeso();
		return this.nome2attrezzo.remove(nomeAttrezzo);
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			s.append(this.nome2attrezzo.values().toString());
		}
		else 
			s.append("Borsa vuota");
		return s.toString();
	}
	
	/**
	 * Restituisce la lista degli attrezzi nella borsa ordinati per peso e quindi, a parità di peso, per nome
	 * @return la lista ordinata per peso degli attrezzi nella borsa 
	 */
	public List<Attrezzo> getContenutoOrdinatoPerPeso(){
		List<Attrezzo> attrezziPerPeso = new ArrayList<Attrezzo>(this.nome2attrezzo.values());  //tra <> andrebbe messo Attrezzo ma il compilatore capisce da solo
		Collections.sort(attrezziPerPeso, new ComparatoreAttrezziPerPeso());
		
		return attrezziPerPeso; 
	}
	
	/**
	 * Restituisce l'insieme degli attrezzi nella borsa ordinati per nome
	 * @return l'insieme ordinato per nome degli attrezzi nella borsa
	 */
	public SortedSet<Attrezzo> getContenutoOrdinatoPerNome(){
		return new TreeSet<Attrezzo>(this.nome2attrezzo.values()) ;
	}
	
	/** 
	 * Restituisce una mappa che associa un intero (rappresentante un peso) con l’insieme (comunque non vuoto) degli attrezzi
	 * di tale peso: tutti gli attrezzi dell'insieme che figura come valore hanno lo stesso peso
	 * pari all'intero che figura come chiave
	 * @return la mappa degli attrezzi
	 */
	public Map<Integer,Set<Attrezzo>> getContenutoRaggruppatoPerPeso(){
		Map<Integer, Set<Attrezzo>> attrezzi = new HashMap<>();
		for(Attrezzo attrezzo : this.nome2attrezzo.values()) {
			Set<Attrezzo> attrezziPeso = attrezzi.get(attrezzo.getPeso());
			if(attrezziPeso == null) {
				attrezziPeso = new HashSet<>();
				attrezzi.put(attrezzo.getPeso(), attrezziPeso);
			}
			attrezziPeso.add(attrezzo);
		}
		return attrezzi;
	}
	
	/**
	 * Restituisce l'insieme degli attrezzi nella borsa ordinati per peso e quindi, a parità di peso, per nome
	 * @return l'insieme ordinato per peso degli attrezzi nella borsa
	 */
	public SortedSet<Attrezzo> getSortedSetOrdinatoPerPeso() {
		SortedSet<Attrezzo> attrezziPerPeso = new TreeSet<Attrezzo>(new ComparatoreAttrezziPerPeso());
		attrezziPerPeso.addAll(this.nome2attrezzo.values());
		return attrezziPerPeso;
	}
}
