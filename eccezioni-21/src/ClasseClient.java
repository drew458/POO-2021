import java.io.FileNotFoundException;
import java.io.IOException;

class ClasseClient {
	ClasseServer server;
	public void metodoClient() {
		int i;
		try {
			i = server.metodoServer(0);
		}
		catch (IllegalArgumentException e) {
			//codice gestione eccezione e
		}
		try {
			server.metodoServer();
		}
		catch (FileNotFoundException e) {
			// <gestione di una file-not-found exception>
			//…
		}
		catch (IOException e) {
			// <gestione generica I/O exception>
			//…
		}
		catch (Exception e) {
			// <gestione di una generica exception>
			//…
		}
	} 
}
