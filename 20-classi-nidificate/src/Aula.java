import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aula {

	private List<Studente> studenti;
	public List<Studente> ordinaStudentiPerEta() {
		class ComparatorePerEta implements Comparator<Studente> {
			@Override
			public int compare(Studente s1, Studente s2){
				return s1.getEta() - s2.getEta();
			}
		}
		ComparatorePerEta comp = new ComparatorePerEta();
		List<Studente> studentiOrdinati = new ArrayList<>(studenti);
		Collections.sort(studentiOrdinati, comp);
		return studentiOrdinati; 
	}

}
