package oop.java.fundamental.application;

import oop.java.fundamental.data.HelloWorld; // Importing HelloWorld interface from the data package

public class HelloWorldApp { // Declaration HelloWorldApp class
    public static void main(String[] args) { // Main method

        /**
         * Kekurangan Anonymous Class
         * - Tidak bisa di reuse
         */
        // Creating an instance of HelloWorld interface using anonymous class for English language
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println(STR."Hello \{name}");
            }
        };

        // Creating an instance of HelloWorld interface using anonymous class for Indonesian language
        HelloWorld indonesia = new HelloWorld() {
            public void sayHello() {
                System.out.println("Halo");
            }


            public void sayHello(String name) {
                System.out.println(STR."Halo \{name}");
            }
        };

        english.sayHello();
        english.sayHello("Adrian");

        indonesia.sayHello();
        indonesia.sayHello("Adrian");
    }
}
