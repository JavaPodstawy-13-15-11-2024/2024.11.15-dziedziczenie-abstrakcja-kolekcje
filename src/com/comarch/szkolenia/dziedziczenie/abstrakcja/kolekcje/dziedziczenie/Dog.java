package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.dziedziczenie;

public class Dog extends Pet {
    private String cos;

    public Dog() {
        System.out.println("Konstruktor dog");
    }

    public void bark() {
        System.out.println("hau hau");
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }
}
