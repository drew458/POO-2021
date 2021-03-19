
public class dummy {
	public int search(String[] elenco,String parola) {
		int i = 0;
		for(String stringaCorrente : elenco) {
			if(stringaCorrente.equals(parola)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public void searchTest() {
		System.out.println("test di search():");
		//inizializza l'elenco di stringhe
		String[] elenco = new String[5];
		elenco[0] = new String("anna");
		elenco[1] = new String("carla");
		elenco[2] = new String("sedia");
		elenco[3] = new String("sei");
		elenco[4] = new String("puma");
		//verifica la presenza di tutte le parole
		System.out.println("\t"+(this.search(elenco,new String("sedia")) == 2));
		System.out.println("\t"+(this.search(elenco,new String("sei")) == 3));
		System.out.println("\t"+(this.search(elenco,new String("carla")) == 1));
		System.out.println("\t"+(this.search(elenco,new String("puma")) == 4));
		System.out.println("\t"+(this.search(elenco,new String("anna")) == 0));
		//verifica la mancanza di parole
		System.out.println("\t"+(this.search(elenco,new String("cane")) == -1));
		System.out.println("\t"+(this.search(elenco,new String("lume")) == -1));
		System.out.println("\t"+(this.search(elenco,new String("gino")) == -1));
		System.out.println("\t"+(this.search(elenco,new String("nota")) == -1));
	}

	public static void main(String[] args) {
		dummy dummy = new dummy();
		dummy.searchTest();
	}
}
