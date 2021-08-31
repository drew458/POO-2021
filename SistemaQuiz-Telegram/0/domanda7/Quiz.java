package domanda7;

class Veicolo {
	public void accendi() {
		System.out.println("VROOOOOOM!!!");
	}
}

class AutoEpoca extends Veicolo {

	@Override
	public void accendi() {
		System.out.println("VROM!");
	}

}


public class Quiz {

	public static void main(String[] args) {
		Veicolo a = new AutoEpoca();
		Veicolo b = new Veicolo();

		a.accendi();
		b.accendi();
	}
}

