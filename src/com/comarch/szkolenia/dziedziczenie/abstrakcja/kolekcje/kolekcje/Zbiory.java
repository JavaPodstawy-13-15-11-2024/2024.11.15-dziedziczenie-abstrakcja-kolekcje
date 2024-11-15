package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.kolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbiory {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Wiesiek");
        set.add("Adam");
        set.add("Karol");
        set.add("Bogdan");

        set.size();
        set.isEmpty();
        /*for(String s : set) {
            if(s.equals("Janusz")) {
                set.remove(s);
            }
        }*/

        System.out.println(set);

        set.add("Janusz");
        System.out.println(set);

        set.remove("Janusz");
        System.out.println(set);
    }
}
