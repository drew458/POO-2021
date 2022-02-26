
public class Coppias {
	
	public static <T> void reverse(CoppiaGeneric<T> c) {
		T tmp;
		
		tmp = c.getPrimo();
		c.setPrimo(c.getSecondo());
		c.setSecondo(tmp);
	}
	
	/**
	 * imposta entrambi gli elementi della coppia che viene 
		passata come primo parametro, con lo stesso 
		riferimento ad oggetto nel secondo parametro.
		
		il tipo su cui la coppia è instanziata deve essere 
		 un supertipo del tipo del parametro.

	 * Coppia<? super T>
	 	Signifca: un riferimento ad un oggetto Coppia istanziato 
		su T o su un qualsiasi supertipo di T
	 * @param <T>
	 * @param coppia
	 * @param elemento
	 */
	static <T> void fill (CoppiaGeneric<? super T> coppia, T elemento) {
		
	}
	
	static <T> void copy (CoppiaGeneric<? super T> dest, CoppiaGeneric<T> <? extends T> src) {
		
	}

}
