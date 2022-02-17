package es4;

/* Cosa stampa il programma? */

class MyException extends RuntimeException {}

public class Quiz {
	private String x;
	
	private void m() {
		if(this.x == null)
			throw new MyException();
		else
			System.out.println("Risposta esatta");
	}
	
	public static void main(String[] args) throws MyException {
		new Quiz().m();
	}
}

/* 
 * L'esecuzione lancia un eccezione di tipo MyException 
*/