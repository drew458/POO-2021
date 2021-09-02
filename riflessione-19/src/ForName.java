
public class ForName {
	
	Class<ComandoVai> classeDiVai = (Class<ComandoVai>)
	Class.forName("it.uniroma3.diadia.comandi.ComandoVai");
	
	//possono sollevarsi ClassNotFoundException
	
	//Usando questi metodi possiamo creare oggetti a 
	//partire dal nome completamente qualificato di una classe (deciso a tempo dinamico) contenuto in un oggetto String

}
