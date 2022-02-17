/* Cosa succede compilando ed eseguendo il codice? */

class MyException extends RuntimeException{}

public class Es9 {
	private String x;
	
	private void m() {
		if(this.x == null) 
			throw new MyException();
		else
			System.out.println("Risposta esatta");
	}
	
	public static void main(String[] args) {
		new Es9().m();
	}
}

/* Compila e viene stampata la stringa Risposta esatta
 * Compila, ma l'esecuzione solleva un eccezione di tipo MyException	<-
 * Non compila perché il metodo main() dichiara esplicitamente di lanciare un'eccezione di tipo MyException
 * Non compila perché il metodo m() non dichiara esplicitamente di poter lanciare un'eccezione di tipo MyException
 */
