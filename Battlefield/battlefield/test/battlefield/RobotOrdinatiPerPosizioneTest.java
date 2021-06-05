package battlefield;

import static org.junit.Assert.*;

import org.junit.*;

public class RobotOrdinatiPerPosizioneTest {
	
	@Test
	public void testRobotOrdinatiPerPosizioneDueRobot() {
		Battlefield field = new Battlefield(2);
		Walker w = new Walker(new Position(0, 1));
		field.addRobot(w);
		Chaser c = new Chaser(new Position(1, 0));
		field.addRobot(c);
		assertSame(c, field.getRobotOrdinatiPerPosizione().get(0));
		assertSame(w, field.getRobotOrdinatiPerPosizione().get(1));
	}
	
	
}
