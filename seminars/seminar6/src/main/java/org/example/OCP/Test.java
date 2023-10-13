package org.example.OCP;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1000,"SOLID");
        Vehicle car = new Car(200);
        Vehicle bus = new Bus(100);
        System.out.println(car.calculateAllowedSpeed());
        System.out.println(bus.calculateAllowedSpeed());
        System.out.println(vehicle.calculateAllowedSpeed());
    }
}
