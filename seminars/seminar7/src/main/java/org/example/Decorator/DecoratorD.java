package org.example.Decorator;

public class DecoratorD extends Decorator{
    public DecoratorD(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void method() {
        System.out.println("Decorator D method");
        super.method();
    }
}
