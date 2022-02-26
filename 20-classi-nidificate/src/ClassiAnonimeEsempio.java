import java.util.Comparator;

public class ClassiAnonimeEsempio {

	Comparator<Studente> comp = new Comparator<Studente>() {
		@Override
		public int compare(Studente s1, Studente s2) {
			... 
		}
	}; // N.B. ‘;’ necessaria
}
