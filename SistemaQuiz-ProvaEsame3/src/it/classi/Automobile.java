package it.classi;

public class Automobile {
	public void consumi(Automobile a) {
		System.out.print("Automobile.consumi(Automobile) ");
                classe();
        }

        public void consumi(Spider b) {
		System.out.print("Automobile.consumi(Spider) ");
		classe();
	}

        public void classe() {
		System.out.print("Automobile.classe()");
	}
}
