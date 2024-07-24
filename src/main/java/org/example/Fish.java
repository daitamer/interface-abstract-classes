package org.example;

public class Fish extends Animal implements Swimmable{

    @Override
    public void makeSound() {

    }

    @Override
    public void swim(){
        System.out.println("Fish is swimming!");
    }

}

