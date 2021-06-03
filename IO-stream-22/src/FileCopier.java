import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCopier {

	/**
	 *   Il seguente programma copia un file 
	*/
	public static void main(String[] args) { 
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		try {
			out = new FileWriter(args[1]);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		boolean eof = false;
		int c; 
		try {
			while (!eof) { 
				c = in.read();
				if (c != -1)
					out.write(c);
				else 
					eof = true;
			} 
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		finally {
			try {
				if (in != null)
					in.close();
				if (out!=null)
					out.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

	/**
	 *  Altro Esempio: Contatore di Parole
	 */
	public Map<String, Integer> countWordOccurrences(String fileName) 
			throws IOException {
		Map<String, Integer> word2count = new HashMap<>();
		BufferedReader reader =
				new BufferedReader(new FileReader(fileName));
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