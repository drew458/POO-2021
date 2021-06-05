package battlefield;

public abstract class Robot {

	private Position posizione;
	private int longevita;
	
	public Robot(Position p) {
		this.posizione = p;
		this.longevita = 0;
	}
	
	public Position getPosizione() {
		return this.posizione;
	}
	
	public int incrementaLongevita() {
		return ++this.longevita;
	}
	
	public int getLongevita() {
		return this.longevita;
	}
	
	public void passo(Battlefield field) {
		Position nuova = this.decidiMossa(field);
		if (nuova!=null) {
			Robot clone = this.creaClone(posizione);
			field.addRobot(clone);
		}
		this.incrementaLongevita();
	}
	
	protected abstract Robot creaClone(Position p);

	protected abstract Position decidiMossa(Battlefield field);

}
