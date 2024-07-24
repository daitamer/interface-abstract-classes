package org.example;

public class Aeroplane extends Vehicle implements Flyable {

    @Override
    void move() {
        System.out.println("Aeroplane is flying. ");
    }

    @Override
    public void fly() {
        System.out.println("I am flying weeee!!! ");
    }
}
