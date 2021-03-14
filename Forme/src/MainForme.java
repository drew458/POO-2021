public class MainForme {
	public static void main(String[] args) {
		Punto origine = new Punto(0,0);
		
		Punto unoZero = new Punto(1,0);
		
		System.out.println("---");
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		origine.trasla(1, 1);
		System.out.println("---");
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		origine.trasla(1,1);
		System.out.println("---");
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		origine.trasla(0,1);
		System.out.println("---");
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println(unoZero.getX());
		System.out.println(unoZero.getY());
		
		Rettangolo rect = new Rettangolo();
		rect.setVertice(origine);
		rect.setBase(8);
		rect.setAltezza(3);
		
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		origine.trasla(1, 1);
		System.out.println("-----");
		System.out.println("traslazione del rettangolo in corso...");
		System.out.println("-----");
		System.out.println(origine.getX());
		System.out.println(origine.getY());
		
		System.out.println("Stampe del rettangolo");
		System.out.println(rect.getBase());
		System.out.println(rect.getAltezza());
		
		System.out.println("Vertice del rettangolo: "+ rect.getVertice().getX() + "," + rect.getVertice().getY());
		rect.sposta(+2, +3);
		System.out.println("Vertice del rettangolo dopo lo spostamento: "+ rect.getVertice().getX() + "," + rect.getVertice().getY());
	}
}
