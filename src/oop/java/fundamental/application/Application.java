package oop.java.fundamental.application;

/**
 * Import Semua Package
 * - Jika ingin mengimport seluruh class di dalam sebuah pa ckage, kita bisa menggunakan tanda *,
 *   contohnya java.oop.fundamental.data.*
 */
import oop.java.fundamental.data.Product;

import oop.java.fundamental.data.*; // tanda * berarti mengakes seluru package di dalam data

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Ryzen 5 5600", 2000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
