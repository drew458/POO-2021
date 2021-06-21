import java.util.Random;

public class MaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMsTest{
	
	private void testMaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMs (CalcolatoreMax calcolatore) {
		int volte=31; // 31 ; 14 … N.B. questi n. dipendono dalla piattaforma...
		for(int v=14; v<volte; v++) {
			int n = (int) Math.pow(2,v); // 2^v
			System.out.println(v+")");
			final int[] array = creaUnArrayDiInteriEriempiloCasualmente(n);
			long prima = System.currentTimeMillis();
			int max = calcolatore.calcolaIlMaxDi(array);
			long dopo = System.currentTimeMillis();
			long ms = dopo - prima ;
			if (ms==0) continue; // troppo veloce, così non riesco a misurare!
			long elXms = n / ( ms ) ; 
			System.out.println("Max= "+max+"; Ogni ms ho calcolato il max di " + elXms + " elementi"); 
		}
	}
		
	private int[] creaUnArrayDiInteriEriempiloCasualmente(int n) {
		int[] interi = new [100];
		Random random = new Random();
		for(int i=0; i<n; i++) {
			interi[i]=random.nextInt();
		}
		return interi;
	}
}