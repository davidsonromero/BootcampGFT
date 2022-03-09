package com.DesignPatterns.Strategy;

public class AggressiveBehaviour implements Behaviour{
    @Override
    public void move() {
        System.out.println("I am an aggressive robot moving quickly");
    }
}
