package it.quiz;

import it.classi.Messaggio;
import it.classi.SMS;
import it.classi.Tweet;

public class Quiz1 {
	public static void main(String[] args) {
		Messaggio messaggio = new SMS("gigi", "damiano");
		
		Messaggio tweet = new Tweet("@gigi");

		Messaggio msg = new Messaggio();
		
		System.out.println(messaggio.getLunghezzaMassima());
		System.out.println(msg.getLunghezzaMassima());
		System.out.println(tweet.getLunghezzaMassima());
	}
}

/*
160
160
280

0
160
280

160
0
160

Il codice non compila

0
160
0
*/