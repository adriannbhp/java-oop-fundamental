package oop.java.fundamental.data;

/**
 * Anonymous Class
 * - Anonymous class atau class tanpa nama
 * - Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung
 * - Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana
 *   kita membuat anonymous class tsb
 * - Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi
 *   interface atau abstract class sederhana, tanpa harus membuat implementasi class nya
 */
public interface HelloWorld {

    void sayHello();

    void sayHello(String name);
}
