package battlefield;

public class Chaser extends Robot {
	
	public Chaser(Position p) {
		super(p);
	}
	
	@Override
	public Position decidiMossa(Battlefield field) {
		Robot inseguito = cercaAvversario(field);
		if (inseguito==null) 
			return null; /* nessuno da inseguire: stai fermo */
		else return inseguito.getPosizione();
	}

	private Robot cercaAvversario(Battlefield field) {
		for(Position p : field.adiacenti(this.getPosizione())) {
			Robot vicino = field.getRobot(p);
			if (isAvversario(vicino)) {
				return vicino;
			}
		}
		return null;
	}

	private boolean isAvversario(Robot avvistato) {
		if (avvistato==null) return false;
		return ( avvistato.getClass() == Walker.class );
	}

	@Override
	protected Robot creaClone(Position p) {
		return new Chaser(p);
	}

}

