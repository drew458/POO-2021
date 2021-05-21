import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aula {
	private Set<Studente> studenti;

	public Aula() {
		this.studenti = new HashSet<Studente>();
	}

	public boolean addStudente(Studente studente) {
		return studenti.add(studente);
	}

	//possibile soluzione 
	public Map<String, List<Studente>> meseDiNascita2studenti() {
		List<Studente> tmp;
		Map<String, List<Studente>> mappa;
		mappa = new HashMap<String, List<Studente>>();
		for(Studente studente : this.studenti){
			tmp = mappa.get(studente.getMeseDiNascita());
			if (tmp==null)
				tmp = new ArrayList<Studente>();
			tmp.add(studente);
			mappa.put(studente.getMeseDiNascita(), tmp);
		}
		return mappa;
	}

	// possibile soluzione numero 2
	public Map<String, List<Studente>> meseDiNascita2studenti2() {
		List<Studente> tmp;
		Map<String, List<Studente>> mappa;
		mappa = new HashMap<String, List<Studente>>();
		for(Studente studente : this.studenti) {
			tmp = mappa.get(studente.getMeseDiNascita());
			if (tmp==null) {
				tmp = new ArrayList<Studente>();
				mappa.put(studente.getMeseDiNascita(),tmp); 
			}
			tmp.add(studente);
		}
		return mappa;
	}
	
	// possbile soluzione numero 3
	public Map<String, List<Studente>> meseDiNascita2studenti3() {
		List<Studente> tmp;
		Map<String, List<Studente>> mappa;
		mappa = new HashMap<String, List<Studente>>();
		for(Studente studente : this.studenti){
			if (mappa.containsKey(studente.getMeseDiNascita())) {
				tmp = mappa.get(studente.getMeseDiNascita());
				tmp.add(studente);
			}
			else {
				tmp = new ArrayList<Studente>();
				tmp.add(studente);
				mappa.put(studente.getMeseDiNascita(), tmp); 
			}
		}
		return mappa;
	}
}