package org.example.Decorator;

public class Main {
    public static void main(String[] args) {
        Decorator c = new DecoratorD(new DecoratorP(new DecoratorS(new MainComponent())));
        c.method();
    }

}
