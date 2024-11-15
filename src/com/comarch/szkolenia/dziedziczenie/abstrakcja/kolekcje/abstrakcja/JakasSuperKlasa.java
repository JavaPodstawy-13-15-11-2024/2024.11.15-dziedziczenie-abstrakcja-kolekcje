package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.abstrakcja;

public class JakasSuperKlasa implements SimpleInterface, X {
    @Override
    public void saveDataToDb(String data) {
        System.out.println("dane zapisane !!!");
    }

    @Override
    public String findClient(long pesel) {
        return "Janusz kowalski";
    }

    @Override
    public int calculate(double a, double b, double c) {
        return 14;
    }

    @Override
    public void x() {

    }
}
