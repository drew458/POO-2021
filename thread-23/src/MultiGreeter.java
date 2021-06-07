
public class MultiGreeter {

	public static void main (String[] args) {
		Thread greeterA = new GreeterA();
		Thread greeterB = new GreeterB();
		Thread threadA = new Thread(greeterA);
		Thread threadB = new Thread(greeterB);
		threadA.start();
		threadB.start();
	}
}
