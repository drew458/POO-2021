package it.quiz;

import it.classi.A;
import it.classi.Y;

public class Quiz1 {
	public static void main(String[] args) {
        A quiz = new Y();
        
        quiz.b();
    }
}

/*
A.b
Y.a
A.c
Y.b

Y.b
Y.a
A.c
A.b

A.b
A.c
Y.a
Y.b

Il codice non compila

A.b
A.c
A.a
Y.b
*/