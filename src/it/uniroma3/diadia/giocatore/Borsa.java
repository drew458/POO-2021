package it.uniroma3.diadia.giocatore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	
	private List<Attrezzo> attrezzi;
	private int pesoMax;
	
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new ArrayList<Attrezzo>();
	}
	
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		return this.attrezzi.add(attrezzo);
	}
	
	public int getPesoMax() {
		return pesoMax;
	}
	
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo attrezzoCercato = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if (attrezzi[i] != null && this.attrezzi[i].getNome().equals(nomeAttrezzo))
				attrezzoCercato = attrezzi[i];
		return attrezzoCercato;
	}
	
	public int getPeso() {
		int peso = 0;
		for (Attrezzo a : this.attrezzi)
			peso += a.getPeso();
		return peso;
	}
	
	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	
	/**
	 * Rimuove un attrezzo dalla borsa (ricerca in base al nome).
	 * @param nomeAttrezzo
	 * @return l'attrezzo rimosso, null altrimenti
	 */
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo attrezzo = null;
		
		Iterator<Attrezzo> iteratore = this.attrezzi.iterator();
		while(iteratore.hasNext()) {
			attrezzo = iteratore.next();
			if(attrezzo.getNome().equals(nomeAttrezzo)) {
				iteratore.remove();
				return attrezzo;
			}
		}
		return null;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.numeroAttrezzi; i++)
				s.append(attrezzi[i].toString()+" ");
		}
		else 
			s.append("Borsa vuota");
		return s.toString();
	}
}
