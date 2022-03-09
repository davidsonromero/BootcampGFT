package com.DesignPatterns.Singleton;

public class SingletonLazyHolder {
    private class Inner {
        public static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Inner.INSTANCE;
    }

    @Override
    public String toString() {
        return "SingletonLazyHolder Instance";
    }
}
