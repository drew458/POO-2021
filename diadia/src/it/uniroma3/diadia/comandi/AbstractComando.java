package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public abstract class AbstractComando {
	private IO io;
	private String parametro;
	
	public IO getIO() {
		return io;
	}
	
	public void setIO(IO console) {
		this.io = console;
	}
	
	public String getNome() {
		int indice = this.getClass().getCanonicalName().indexOf("Comando");
		return this.getClass().getCanonicalName().substring(indice + 7).toLowerCase();
	}
	
	public String getParametro() {
		return parametro;
	}
	
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	
	abstract public void esegui(Partita partita);	
}