package ex_MyException;

//Cosa succede compilando ed eseguendo il seguente codice?
public class C {
	
	private String x;
    
	private void m() {
        if (this.x == null)
            throw new MyException();
        else
            this.x.concat(" - tail");
    }
    
	public static void main(String[] args) throws MyException {
        C c = new C();
        c.m();
    }
}

/*
Compila, ma l'esecuzione solleva un'eccezione di tipo MyException

--------Altre risposte--------
- Non compila perché il metodo main() dichiara esplicitamente di lanciare un'eccezione di tipo MyException
- Nessuna delle altre.
- Non compila: il metodo m() non dichiara di poter lanciare un'eccezione di tipo MyException.
*/