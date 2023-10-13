package org.example.DIP;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselEngine());
        car.start();
    }
}
