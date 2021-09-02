package battlefield;


/*
 * Da sistemare. Vedi PositionTest.
 * (vedi DOMANDA 1)
 */
public class Position implements Comparable<Position> {

	private int x, y;

	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return this.x+"-"+this.y;
	}

	@Override
	public boolean equals(Object obj) {
		Position that = (Position) obj;
		return this.getX() == that.getX() && this.getY() == that.getY();
	}

	@Override
	public int hashCode() {
		return this.getX() + this.getY()*31;
	}
	
	@Override
	public int compareTo(Position that) {
		int ris = this.getX() - that.getX();
		if(ris!=0)
			return ris;
		return this.getY() - that.getY();
	}

}