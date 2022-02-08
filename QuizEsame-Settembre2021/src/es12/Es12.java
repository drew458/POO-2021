package es12;

public class Es12 {}

/* Cosa stampa questo programma? */

class ExampleException extends Exception{};
	
class ExampleClass {
	
	private void exampleMethod(int k) throws ExampleException{
		if(k>0)
			System.out.println("K");
		else
			throw new ExampleException();
	}
	
	public static void main(String[] args) {
		ExampleClass ec = new ExampleClass();
		
		try {
			ec.exampleMethod(5);
		} catch (ExampleException e) {
			System.out.println("A");
			return;
		} finally {
			System.out.println("F");
		}
		
		try {
			ec.exampleMethod(-3);
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			System.out.println("F");
		}
	}
}

/* K
 * A
 * F
 * 
 * Viene sollevata un'eccezione di tipo ExampleException
 * 
 * K
 * A
 */
