package oop.java.fundamental.application;

import oop.java.fundamental.data.Fruits;

public class FruitsApp {
    public static void main(String[] args) {

        Fruits fruits = new Fruits("Grapes", "Purple", 150);
        System.out.println(fruits.fruit);
        System.out.println(fruits.color);
        System.out.println(fruits.weight);
    }
}
