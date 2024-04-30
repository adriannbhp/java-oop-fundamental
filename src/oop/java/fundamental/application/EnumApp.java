package oop.java.fundamental.application;

import oop.java.fundamental.annotation.Fancy;
import oop.java.fundamental.data.Customer;
import oop.java.fundamental.data.Level;

@Fancy(name = "EnumApp", tags = {"application", "java"})

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Adrian");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        // Konversi Enum ke String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        Level[] levels = Level.values();
        for (var value : Level.values()) {
            System.out.println(value);
        }



    }
}
