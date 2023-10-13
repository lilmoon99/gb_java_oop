package org.example.Decorator;

public class DecoratorP extends Decorator {
    public DecoratorP(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void method() {
        System.out.println("Decorator P method");
        super.method();
    }
}
