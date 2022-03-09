package com.DesignPatterns.Strategy;

public class NormalBehaviour implements Behaviour {
    @Override
    public void move() {
        System.out.println("I am a normal robot moving forward");
    }
}
