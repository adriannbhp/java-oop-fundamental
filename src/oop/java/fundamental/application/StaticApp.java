package oop.java.fundamental.application;

// Static Import
import static oop.java.fundamental.data.Application.PROCESSORS; // Importing a static member from Application class
import static oop.java.fundamental.data.Constant.*; // Importing all static members from Constant class

import oop.java.fundamental.data.Country; // Importing Country class
import oop.java.fundamental.util.MathUtil; // Importing MathUtil class

/**
 * Static Keyword
 * - Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
 * - Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses
 *   langsung tanpa melalui objectnya
 * - Perlu diingat, static hanya bisa mengakses static lainnya
 */

/**
 * Static Dapat Digunakan di
 * - Field, atau disebut class Variable, artinya field tsb bisa diakses langsung tanpa membuat object
 *   terlebih dahulu
 * - Method, atau disebut class Method, artinya method tsb bisa diakses langsung tanpa membuat
 *   object terlebih dahulu
 * - Block, static block akan otomatis dieksekusi ketika sebuah class di load
 * - Inner class, artinya inner class tsb bisa diakses secara langsung tanpa harus membuat object
 *   outer class terlebih dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi
 *   object outer class nya
 */
public class StaticApp { // Declaration StaicApp class
    public static void main(String[] args) { // Main Method

        // Memanggil Static Members

        // Printing values of static constants from Constant class
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // Printing the result of sum method from MathUtil class
        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        // Creating an instance of inner class City from Country class and setting its name
        Country.City city = new Country.City();
        city.setName("Bandung");

        // Printing the name of the city
        System.out.println(city.getName());

        // Printing the value of static member PROCESSORS from Application class using static import
        System.out.println(PROCESSORS);
    }
}
