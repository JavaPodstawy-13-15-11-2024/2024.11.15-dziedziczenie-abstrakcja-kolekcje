package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.abstrakcja;

public class App {
    public static void main(String[] args) {
        SimpleInterface jakasKlasaKolegi = new JakasSuperKlasa();

        jakasKlasaKolegi.findClient(12312);
        jakasKlasaKolegi.calculate(2.2, 3.3, 4.4);
        jakasKlasaKolegi.saveDataToDb("djfhgkjhsdf");
    }
}
