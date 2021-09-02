import java.lang.reflect.Method;
import java.util.Iterator;

public class GetMethods {
	public static void main(String[] args) {
		Class<Iterator> classeDiIterator = Iterator.class;
		for (Method m : classeDiIterator.getMethods())
			System.out.println(m);
	}
}

//Possibile esecuzione (con Java 7)
//$ java EsempioRiflessione
//	public abstract boolean java.util.Iterator.hasNext()
//	public abstract java.lang.Object java.util.Iterator.next()