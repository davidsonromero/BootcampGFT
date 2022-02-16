package com.animals;

import com.animals.species.Dog;
import com.animals.species.Cat;

public class Animals {
    public static void main(String[] args) {
        Cat cat = new Cat("Mittens", 2, "black", "Persian");
        Dog dog = new Dog("Fido", 3, "brown", "Labrador");
        System.out.println(cat.getName() + " is a " + cat.getAge() + " year old " + cat.getColour() + " " + cat.getBreed() + " cat.");
        System.out.println(dog.getName() + " is a " + dog.getAge() + " year old " + dog.getColour() + " " + dog.getBreed() + " dog.");
    }
}
