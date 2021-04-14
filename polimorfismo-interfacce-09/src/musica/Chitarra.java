package musica;

public class Chitarra implements Strumento {

	private int[] corde;
	
	public Chitarra(){
		corde = new int[6];
	}

	public void produciSuono() {
		System.out.println("dlen-dlen-dlen"); 
	}
	public int accorda(int corda, int val) {
		return corde[corda] += val;
	}


}
