
public class CalcolatoreMaxParallelo implements CalcolatoreMax {

	final private CalcolatoreMaxSeriale calcolatoreSeriale = new CalcolatoreMaxSeriale();
	
	@Override
	public int calcolaIlMaxDi(final int[] array) {
		int _N_CORE = Runtime.getRuntime().availableProcessors();
		final int[] maxRelativi = new int[_N_CORE];
		final Thread[] lavoratori = new Thread[_N_CORE];
		int dimensioneFetta = ( array.length ) / _N_CORE;
		int resto = ( array.length ) % _N_CORE;
		int inizio_fetta = 0;
		for(int i=0; i<_N_CORE; i++) {
			/* fai calcolare il massimo relativo per
			 questa fetta d’array ad un thread dedicato */
			int fine_fetta = inizio_fetta + dimensioneFetta;
			if (i<resto) fine_fetta++; // sfrido distributo ai primi thread
			final int indiceFetta = i;
			lavoratori[indiceFetta] = new Thread(new Runnable() {
				@Override
				public void run() {
					maxRelativi[indiceFetta] =
						calcolatoreSeriale.calcolaIlMaxDi(array, inizio_fetta, fine_fetta);
				}	
			});
			lavoratori[i].start(); // comincia subito
			inizio_fetta = fine_fetta;
		}
		/* aspetta abbiano tutti i worker thread abbiano terminato */
		for(int i=0; i<_N_CORE; i++) { 
			try { 
				lavoratori[i].join(); 
			} catch (InterruptedException e) { // N.B. Checked Exception!
				throw new RuntimeException(e);
			}
		}
		return calcolatoreSeriale.calcolaIlMaxDi(maxRelativi);
	}
}
