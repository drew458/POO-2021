package ant.formica;

import static ant.costanti.CostantiGUI.IMMAGINE_FORMICA_ROSSA;

import java.awt.Image;
import java.util.Set;

import ant.Ambiente; 
import ant.Direzione;

public class Aggressiva extends Formica {
	
	static private int progId = 0;

	public Aggressiva(Ambiente ambiente) {
		super(ambiente, progId++);
		
	}

	@Override
	protected Direzione decidiDirezione(Set<Direzione> possibili) {
		/* Direzione 2b */
		final Direzione direzioneDelCibo = this.getAmbiente().getDirezioneCiboVicino(this.getPosizione());
		if(direzioneDelCibo != null) {
			/* cibo trovato! */
			return direzioneDelCibo;
		}
		else {
			/* non trovo cibo nelle vicinanze */
			final Set<Direzione> possibiliDirezioni = this.getAmbiente().getPossibiliDirezioni(this.getPosizione());
			return Direzione.scegliAcasoTra(possibiliDirezioni);
		}
	}

	@Override
	public Image getImmagine() {
		return IMMAGINE_FORMICA_ROSSA;
	}

	
}
