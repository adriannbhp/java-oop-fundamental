package oop.java.fundamental.data;

/**
 * Access Modifier
 * - Access modifier adalah kemampuan membuat class, field, method dan constructor dapat
 *   diakses dari mana saja
 * - Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default (no-modifier)
 * - Sekarang kita akan bahas access modifier lainnya
 */

/**
 * Public Class
 * - Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
 * - Selain itu, nama public class harus sama dengan nama file
 */
public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Ryzen 5 5600", 2000000);

        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product); // Mencetak objek (jika tidak di-override: oop.java.fundamental.data.Product@6acbcfc0)
        System.out.println(product); // Mencetak objek (jika override ToString Method: Product name:Ryzen 5 5600, price:2000000)

        Product product2 = new Product("Ryzen 5 5600", 2000000); // Membuat instansi lain dari kelas Product

        System.out.println(product.equals(product2)); // Memeriksa apakah dua objek sama
        System.out.println(product.hashCode() == product2.hashCode()); // Memeriksa apakah hash code dari dua objek sama
    }
}
