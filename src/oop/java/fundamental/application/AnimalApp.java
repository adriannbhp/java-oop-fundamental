package oop.java.fundamental.application;

import oop.java.fundamental.annotation.Fancy;
import oop.java.fundamental.data.Animal;
import oop.java.fundamental.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {


        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
