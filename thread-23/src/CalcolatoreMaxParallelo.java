
public class CalcolatoreMaxParallelo implements CalcolatoreMax {

	@Override
	public int calcolaIlMaxDi(int[] array) {
		int _N_CORE = Runtime.getRuntime().availableProcessors();
		final int[] maxRelativi = new int[_N_CORE];
		final Thread[] lavoratori = new Thread[_N_CORE];
		int dimensioneFetta = ( array.length ) / _N_CORE;
		int resto = ( array.length ) % _N_CORE;
		int inizio_fetta = 0;
		for(int i=0; i<_N_CORE; i++) {
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
}
