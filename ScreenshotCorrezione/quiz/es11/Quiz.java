package es11;

/* Cosa stampa questo programma */

class ExampleException extends Exception{};

public class Quiz {
	
	private void exampleMethod(int k) throws ExampleException {
		if (k>0)
			System.out.println("B");
		else
			throw new ExampleException();
	}
	
	public static void main(String[] args) {
		Quiz q = new Quiz();
		
		try {
			q.exampleMethod(5);
		} catch (ExampleException e) {
			System.out.println("A");
			return;
		} finally {
			System.out.println("C");
		}
		
		try {
			q.exampleMethod(-3);
		} catch (ExampleException e) {
			System.out.println("A");
			return;
		} finally {
			System.out.println("C");
		}
	}
}

/* B
 * C
 * A
 * C
*/