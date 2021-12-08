package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    @Override
    public void sound() {
        System.out.println("I'm a Dog. My name is " + this.dogName + ". " + "Gav");
    }
}
