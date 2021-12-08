package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    @Override
    public void sound() {
        System.out.println("I'm a Cat. My name " + this.catName + ". " + "Mew");
    }
}
