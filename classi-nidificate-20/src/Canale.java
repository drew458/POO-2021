import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Canale {

	private List<Studente> studenti;
	public SortedSet<Studente> ordinaStudentiPerVoto(
			final Map<Studente, Integer> studente2voto) {
		class ComparatorePerVoto implements Comparator<Studente> {
			@Override
			public int compare(Studente s1, Studente s2){
				int votoS1 = studente2voto.get(s1);
				int votoS2 = studente2voto.get(s2);
				return ( votoS1 – votoS2 ) ;
			}
		}
		ComparatorePerVoto comp = new ComparatorePerVoto();
		SortedSet<Studente> studentiOrdinati = new TreeSet<>(cmp);
		studentiOrdinati.addAll(studentiOrdinati);
		return studentiOrdinati;
	}
}
