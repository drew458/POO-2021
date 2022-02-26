/**
 * Questo metodo invece, con Forma al posto dei tipi Cerchio e Quadrato, invece non compila
 *
 */
public class CalcolatoreDiAreaNonCompila {
	public float areaDi(Cerchio c) {
		int r = c.getRaggio();
		return 3.14f *r *r;
	}
	
	public float areaDi(Quadrato q) {
		int l = q.getLato();
		return l * l;
	}
	
	public static void main(String args) {
		CalcolatoreDiArea calcolatore = new CalcolatoreDiArea();
		Forma cerchio = new Cerchio(1);
		Forma quadrato = new Quadrato(2);
		System.out.println(calcolatore.areaDi(cerchio));
		System.out.println(calcolatore.areaDi(quadrato));
	}
}
