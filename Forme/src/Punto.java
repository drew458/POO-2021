
public class Punto {
	private int x;
	private int y;
	public void setX(int posX) {
		x = posX;
	}
	
	public void setY(int posY) {
		y = posY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void trasla(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	
}


