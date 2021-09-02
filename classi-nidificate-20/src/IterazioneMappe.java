import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterazioneMappe {
	Map<String, Integer> nome2eta = new HashMap<>();
	// …
	for (Entry<String, Integer> e : nome2eta.entrySet())
	 System.out.println(e.getKey() + " " + e.getValue());

}
