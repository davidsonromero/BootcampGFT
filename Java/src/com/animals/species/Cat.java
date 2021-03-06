package com.animals.species;

public class Cat {
    private String name;
    private int age;
    private String colour;
    private String breed;
    
    public Cat(String name, int age, String colour, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
    
    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void meow() {
        System.out.println("Meow!");
    }

}
