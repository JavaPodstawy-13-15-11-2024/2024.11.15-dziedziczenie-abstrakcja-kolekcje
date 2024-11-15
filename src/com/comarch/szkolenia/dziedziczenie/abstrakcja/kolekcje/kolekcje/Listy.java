package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        lista.add("Janusz");
        lista.add("Wiesiek");

        System.out.println(lista.size());
        System.out.println(lista);

        lista.add("Karol");
        lista.add("Janusz");

        System.out.println(lista.size());
        System.out.println(lista);

        lista.remove("Janusz");

        System.out.println(lista.size());
        System.out.println(lista);

        lista.add(2, "asdfgsdf");

        System.out.println(lista);

        lista.set(2, "cos nowego");
        System.out.println(lista);

        lista.add(4, "asdfgas");
        System.out.println(lista);

        System.out.println(lista.get(0));

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6.6);
        list2.add(true);
        list2.add("ABC");
        list2.trimToSize();

        metoda(lista);

        var x = cos();

        x = 7;
    }

    public static void metoda(List<String> list) {
        if(list instanceof ArrayList<String>) {
            ArrayList<String> list2 = (ArrayList<String>) list;
            list2.trimToSize();
        }
    }

    public static double cos() {
        return 6;
    }
}
