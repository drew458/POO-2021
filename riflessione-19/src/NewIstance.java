
public class NewIstance {
	
//	Con la riflessione è possibile invece anche creare oggetti di 
//	tipo T invocando un metodo newInstance() offerto da un oggetto di tipo Class<T>, con questa segnatura:

	//	T newInstance()


	Class<ComandoVai> classeDiVai = ComandoVai.class;
	Comando vai = classeDiVai.newIstance();
}
