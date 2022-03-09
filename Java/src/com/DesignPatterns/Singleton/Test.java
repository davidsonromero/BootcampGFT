package com.DesignPatterns.Singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazy + " " + singletonEager + " " + singletonLazyHolder);
    }
}