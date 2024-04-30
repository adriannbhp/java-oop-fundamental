package oop.java.fundamental.application;

import oop.java.fundamental.data.City;

public class LocationApp {
    public static void main(String[] args) {

//        var location = new Location(); // ERROR : 'Location' is abstract; cannot be instantiated
          var city = new City();
          city.name = "Bandung";

        System.out.println(city.name);
    }
}
