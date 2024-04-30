package oop.java.fundamental.application;

import oop.java.fundamental.annotation.Fancy;
import oop.java.fundamental.data.Avanza;
import oop.java.fundamental.data.Car;

@Fancy(name = "CarApp", tags = {"application", "java"})

public class CarApp  {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
