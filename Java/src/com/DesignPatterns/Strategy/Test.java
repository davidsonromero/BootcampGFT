package com.DesignPatterns.Strategy;

public class Test {
    public static void main(String[] args) {
        Behaviour normalBehaviour = new NormalBehaviour();
        Behaviour defensiveBehaviour = new DefensiveBehaviour();
        Behaviour aggressiveBehaviour = new AggressiveBehaviour();

        Robot robot = new Robot();
        robot.setBehaviour(normalBehaviour);
        robot.move();
        
        robot.setBehaviour(defensiveBehaviour);
        robot.move();

        robot.setBehaviour(aggressiveBehaviour);
        robot.move();
    }
}