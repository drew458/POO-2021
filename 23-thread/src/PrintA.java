public class PrintA implements Runnable {

	@Override
	public void run() {
		for(int j=0; j<100; j++)
			System.out.println("Sono A");
	}

}
