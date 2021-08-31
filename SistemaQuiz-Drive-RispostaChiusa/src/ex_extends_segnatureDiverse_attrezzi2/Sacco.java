package ex_extends_segnatureDiverse_attrezzi2;

public class Sacco extends Contenitore {

	public void addAttrezzo(Attrezzo a) {
		Attrezzo[] att = this.getAttrezzi();
		for(int i=0; i<att.length;i++) {
			if(att[i] ==null) {
				this.addAttrezzo(a,i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Sacco sacco = new Sacco();
		Attrezzo attrezzo = new Attrezzo();

		sacco.addAttrezzo(attrezzo);
		sacco.addAttrezzo(attrezzo, 2);
		sacco.addAttrezzo(attrezzo);

	}
}

/*
Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 2
Contenitore.addAttrezzo() --- aggiunto in 1
*/