package oop.java.fundamental.data;
/**
 * Access Modifier
 * - Access modifier adalah kemampuan membuat class, field, method dan constructor dapat
 *   diakses dari mana saja
 * - Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier)
 * - Sekarang kita akan bahas access modifier lainnya
 */

/**
 * Access Level
 * Modifier         Class   Package    Subclass     World
 * - public         - Y        Y            Y          Y
 * - protected      - Y        Y            Y          N
 * - no modifier    - Y        Y            N          N
 * - private        - Y        N            N          N
 */

import java.util.Objects;

/**
 * Public Class
 * - Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
 * - Selain itu, nama public class harus sama dengan nama file
 */
public class Product {

    // private String name; // Private hanya bisa diakses didalam class yang sama
    // private int price; // Private hanya bisa diakses didalam class yang sama

    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    /**
     * ToString Method
     * - toString() adalah method yang terdapat di class Object
     * - Method ini biasanya digunakan untuk merepresentasikan object
     *   dalam bentuk String
     * - Secara default, toString() ini akan menghasilkan:
     *     - nameclass + @ + hashCode
     * - Namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
     */
    // Override ToString Method
    // Jika tidak di override hasilnya menjadi sulit dibaca contoh : oop.java.fundamental.data.Product@6acbcfc0
    public String toString() { // Override method toString
        return STR."Product name:\{name}, price:\{price}"; // Mengembalikan representasi string dari object
    }

    @Override
    public boolean equals(Object o) { // Override method equals
        if (this == o) return true; // Jika object sama, mengembalikan true
        if (o == null || getClass() != o.getClass()) return false; // Jika object bukan dari class yang sama, mengembalikan false

        Product product = (Product) o; // Casting the object to Product class

        if (price != product.price) return false; // Jika harga tidak sama, mengembalikan false
        return Objects.equals(name, product.name); // Jika nama sama, mengembalikan true
    }

    /**
     * HashCode Method
     * - Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan
     *   representasi String, hashCode adalah representasi integer
     * - HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, set, dan lain-lai,
     *   karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
     * - Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa
     *   mengoverride nya jika kita ingin
     */

    /**
     * Kontrak HashCode Method
     * Tidak mudah meng-override method hashCode, karena ada kontraknya :
     * - Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer
     *   yang sama
     * - Jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode
     *   nya juga harus sama
     * - Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan
     *   jumlah integer sekitar 2 milyar
     */
    @Override
    public int hashCode() { // Melakukan override method hashCode
        int result = name != null ? name.hashCode() : 0; // Menghitung hash code untuk variabel name
        result = 31 * result + price; // Menggabungkan hash code dengan variabel price
        return result; // Mengembalikan hash code akhir
    }

    //    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof  Product)){
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if (this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
}
