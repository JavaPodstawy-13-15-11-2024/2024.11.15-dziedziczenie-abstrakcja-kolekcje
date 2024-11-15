package com.comarch.szkolenia.dziedziczenie.abstrakcja.kolekcje.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Owczarek");
        dog.setAge(10);
        dog.bark();
        dog.walk();

        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setRace("Dachowiec");
        cat.setAge(5);
        cat.walk();

        Snake snake = new Snake();
        snake.setName("Pyton");
        snake.setAge(20);
        snake.walk();

        Pet pet = new Dog();
        Object o = new Cat();

        pet.getAge();
        pet.walk();
        if(pet instanceof Dog) {
            Dog d = (Dog) pet;
            d.bark();
        }

        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];
        Snake[] snakes = new Snake[5];

        Pet[] pets = new Pet[15];
        pets[0] = new Dog();
        pets[1] = new Cat();
        pets[2] = new Snake();

        ((Dog) pets[0]).bark();
        pets[2].walk();
    }
}
