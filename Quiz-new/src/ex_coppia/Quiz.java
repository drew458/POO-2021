package ex_coppia;

//Cosa stampa?
public class Quiz {

	public static void main(String[] args) {
		IndianaJones p=new Predatori();
		IndianaJones t=new Tempio();
		Coppia c = new Coppia(p, t);
		stampa(c);
	}
	static void stampa(Coppia<IndianaJones> c) {
		c.getSecondo().stampa();
	}
}

/*
Stampa Il tempio maledetto
*/