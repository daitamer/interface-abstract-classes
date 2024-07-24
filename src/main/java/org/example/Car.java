package org.example;

public class Car extends Vehicle implements Runnable {
    @Override
    void move() {
        System.out.println("Car is driving.");
    }
}
