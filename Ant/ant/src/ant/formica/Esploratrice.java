package ant.formica;

import static ant.costanti.CostantiGUI.IMMAGINE_FORMICA_VERDE;
import static ant.costanti.CostantiSimulazione.PROBABILITA_CAMBIO_DIREZIONE;
import static ant.simulatore.GeneratoreCasuale.siVerificaEventoDiProbabilita;

import java.awt.Image;
import java.util.Set;

import ant.Ambiente;
import ant.Direzione;

/**
 * Modella una formica <EM>esploratrice</EM>.
 * <B>(VEDI DOMANDA 2)</B>
 */
public class Esploratrice extends Formica {
	
	static private int progId=0;

	public Esploratrice(Ambiente ambiente) {
		super(ambiente, progId++);
	}

	public Direzione decidiDirezione(Set<Direzione> possibili) {
		Direzione risultato = this.getDirezione();
		
		/* controlla se non sia il momento di cambiare direzione */
		if (decideDiCambiareDirezione() || deveCambiareDirezione(possibili))
			risultato = cambioDirezione(possibili);
		
		return risultato;
	}
	
	public boolean decideDiCambiareDirezione() {
		return ( siVerificaEventoDiProbabilita(PROBABILITA_CAMBIO_DIREZIONE) ) ;
	}

	public Direzione cambioDirezione(Set<Direzione> possibili) {
		return Direzione.scegliAcasoTra(possibili);
	}

	@Override
	public Image getImmagine() {
		return IMMAGINE_FORMICA_VERDE;
	}

}
