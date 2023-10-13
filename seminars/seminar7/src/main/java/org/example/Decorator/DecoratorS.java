package org.example.Decorator;

public class DecoratorS extends Decorator{

    public DecoratorS(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void method() {
        System.out.println("Decorator S method");
        super.method();
    }


}
