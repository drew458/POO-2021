
public class MainThread {
	public static void main(String[] args) {
		Thread t = new Thread(new PrintA());
		t.start();
		for(int j=0; j<100; j++)
			System.out.println("Sono Main");
	}
}
