import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MappeBoxingUnboxingCorretto {

	public Map<String, Integer> countWordOccurrences(String text){
		Map<String, Integer> word2count = new HashMap<>();
		Scanner scanner = new Scanner(text);
		while (scanner.hasNext()) {
			String word = scanner.next();
			int count = word2count.get(word).intValue();
			if (count==0) {
				count = 1;
			}
			else {
				count = count + 1;
			}
			word2count.put(word, new Integer(count));
		}
		return word2count;
	}
}
