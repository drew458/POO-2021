import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContatoreDiParole {

	public Map<String, Integer> countWordOccurrences(String fileName) throws IOException {
		Map<String, Integer> word2count = new HashMap<>();
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = reader.readLine()) != null) {
			Scanner scannerLinea = new Scanner(line);
			while (scannerLinea.hasNext()) {
				String word = scannerLinea.next();
				int count = 0;
				if (word2count.containsKey(word))
					count = word2count.get(word);
				count = count + 1;
				word2count.put(word, count);
			}
		}
		reader.close();
		return word2count;
	}
}
