package battlefield;

import java.util.Comparator;

public class ComparatorePerPosizione implements Comparator<Robot> {

	@Override
	public int compare(Robot r1, Robot r2) {
		Position p1 = r1.getPosizione();
		Position p2 = r2.getPosizione();
		return p1.compareTo(p2);
	}

}
