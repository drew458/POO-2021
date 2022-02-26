import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class EsempioProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("cfu_iniziali", "10");
		prop.setProperty("peso_max_borsa", "20");
		prop.store(new FileWriter("diadia.properties"),
				"Configurazione del gioco DIADIA");
		prop.storeToXML(new FileOutputStream("diadia.xml"), 
				"Configurazione del gioco DIADIA");
	}
}
