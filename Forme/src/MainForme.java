public class MainForme {
	public static void main(String[] args) {
		Punto origine = new Punto();
		origine.setX(0);
		origine.setY(0);
		
		Rettangolo rect = new Rettangolo();
		rect.setVertice(origine);
		rect.setBase(8);
		rect.setAltezza(3);
		
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		origine.trasla(1, 1);
		System.out.println(origine.getX());
		
		System.out.println("Stampe del rettangolo");
		System.out.println(rect.getBase());
		System.out.println(rect.getAltezza());
	}
}
