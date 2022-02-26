import org.junit.Test;

public class ElementiCalcolatiOgnimsTest {

	@Test
	public void testMaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMillisecondo_seriale() {
		System.out.println("_______________SERIALE_______________");
		this.testMaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMs(
				new CalcolatoreMaxSeriale()
				);
	}

	@Test
	public void testMaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMillisecondo_parallelo() {
		System.out.println("______________PARALLELO______________");
		this.testMaDiQuantiElementiRiescoAcalcolareIlMaxInOgniMs(
				new CalcolatoreMaxParallelo()
				);
	}
}
