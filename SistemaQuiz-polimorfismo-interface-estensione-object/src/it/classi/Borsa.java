package it.classi;

public class Borsa extends Contenitore {
	
	public void addAttrezzo(Attrezzo a) {
        Attrezzo[] att = this.getAttrezzi();
        for (int i = 0; i < att.length; i++){
            if(att[i] == null){
                this.addAttrezzo(a,i);
                break;
            }
        }
    }
    
    public static void main(String[]args){
        Borsa borsa = new Borsa();
        Attrezzo attrezzo = new Attrezzo();
        
        borsa.addAttrezzo(attrezzo);
        borsa.addAttrezzo(attrezzo,2);
        borsa.addAttrezzo(attrezzo);
    }
}

/*
Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 2
Contenitore.addAttrezzo() --- aggiunto in 1

Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 2
Contenitore.addAttrezzo() --- aggiunto in 3

Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 3
Contenitore.addAttrezzo() --- aggiunto in 1

Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 2
Contenitore.addAttrezzo() --- aggiunto in 3

Contenitore.addAttrezzo() --- aggiunto in 0
Contenitore.addAttrezzo() --- aggiunto in 1
Contenitore.addAttrezzo() --- aggiunto in 2

Il codice non compila
*/