package tetris.pozzo;

import java.util.Comparator;

public class ComparatoreCelleDecrescente implements Comparator<Cella> {

	@Override
	public int compare(Cella o1, Cella o2) {
		int yDiff = -(o1.getPosizione().getY() - o2.getPosizione().getY());
		if(yDiff != 0)
			return yDiff;
		return -(o1.getPosizione().getX() - o2.getPosizione().getX());
	}
}
