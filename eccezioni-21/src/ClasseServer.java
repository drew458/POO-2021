
public class ClasseServer {

	public int metodoServer(int arg) throws IllegalArgumentException {
		if (arg<=0)
			throw new IllegalArgumentException("arg>0");
		//…
		return arg;
	}
	
	
}