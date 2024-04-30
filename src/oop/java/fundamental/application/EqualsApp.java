package oop.java.fundamental.application;

import static java.lang.StringTemplate.STR;

public class EqualsApp {
    public static void main(String[] args) {
        /**
         * Equals Method
         * - Hal yang agak membingungkan di Java adalah, cara membandingkan object
         * - Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya
         *   menggunakan operator ==, di Java, operator == hanya untuk mengecek data primitif
         * - Untuk non primitif pengecekannya menggunakan method equals
         * - Dan secara default, method equals itu akan membandingkan dual buah object secara
         *   kesamaan posisi di object di memory, artinya jika kita membuat 2 object yang isi fields
         *   nya sama, tetap dianggap beda oleh method equals
         * - Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tsb
         */

        String first = "Adrian";
        first = STR."\{first} Bimo";

        System.out.println(first); // Output : Adrian Bimo

        String second = "Adrian Bimo";
        System.out.println(second); // Output : Adrian Bimo

        System.out.println(first == second ); // Output : false (Membandingkan alamat memory)
        System.out.println(first.equals(second)); // Output : true (Membandingkan nilai string)

        String third = "Adrian Bimo";

        System.out.println(second == third); // Output : true (Membandingkan alamat memory)
        System.out.println(second.equals(third)); // Output : true (Membandingkan nilai string)
    }
}
