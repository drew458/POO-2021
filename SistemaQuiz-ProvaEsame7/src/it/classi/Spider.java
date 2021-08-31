package it.classi;

public class Spider extends Automobile {
	public void consumi(Automobile a) {
		System.out.print("Spider.consumi(Automobile) ");
		classe();
	}

    public void consumi(Spider b) {
		System.out.print("Spider.consumi(Spider) ");
	       classe();
    }

    public void classe() {
    	System.out.print("Spider.classe()");
	}
}
