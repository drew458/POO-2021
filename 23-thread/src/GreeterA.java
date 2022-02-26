
public class GreeterA extends Thread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello! I’m A");
	}
}
