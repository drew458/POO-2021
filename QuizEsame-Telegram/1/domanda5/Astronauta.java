package domanda5;

public class Astronauta {
	private String nome;

	public Astronauta(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}


	public static void main(String args[]) {
		Astronauta[] uomo = new Astronauta[10];
		Astronauta p1 = new Astronauta("Armstrong");

		uomo[0] = p1;
		p1.setNome("Brown");
		uomo[1] = p1;
		uomo[2] = new Astronauta("Carter");
		uomo[3] = new Astronauta("Fisher");

		Astronauta mister = new Astronauta("Fisher");

		for(int i = 0; i<4; i++)
			if (uomo[i] != mister)
				System.out.print(uomo[i].getNome()+" ");
	}

}
