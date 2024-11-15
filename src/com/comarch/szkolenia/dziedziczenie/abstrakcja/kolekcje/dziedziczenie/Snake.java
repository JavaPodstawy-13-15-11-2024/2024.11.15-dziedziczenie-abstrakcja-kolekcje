package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.dziedziczenie;

public class Snake extends Pet {

    @Override
    @Deprecated
    public void walk() {
        //System.out.println("Pelzam !!!");
        pelzaj();
    }

    public void pelzaj() {
        System.out.println("Pelzam !!!");
    }


}
