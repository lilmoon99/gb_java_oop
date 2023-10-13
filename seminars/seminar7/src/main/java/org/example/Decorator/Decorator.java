package org.example.Decorator;

public abstract class Decorator implements InterfaceComponent{
    InterfaceComponent component;

    public Decorator(InterfaceComponent component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
