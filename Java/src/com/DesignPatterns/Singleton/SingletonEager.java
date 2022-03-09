package com.DesignPatterns.Singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonEager Instance";
    }
}
