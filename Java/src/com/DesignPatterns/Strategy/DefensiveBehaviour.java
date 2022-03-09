package com.DesignPatterns.Strategy;

public class DefensiveBehaviour implements Behaviour {
    @Override
    public void move() {
        System.out.println("I am a defensive robot moving carefully");
    }
}
