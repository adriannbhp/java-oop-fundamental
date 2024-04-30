package oop.java.fundamental.data;

/**
 * Interface
 * - Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai contract untuk class child nya
 * - Namun sebenarnya yang lebih tepat untuk kontrak adalah interface
 * - Jangan salah sanga bahwa interface disini bukanlah User Interface
 * - Interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract,
 *   tidak memiliki block
 * - Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
 * - Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements
 */

// Multitple Interface Inheritance

public interface Car extends HasBrand, isMaintenance { // Mendeklarasikan interface Car yang mewarisi dua interface lainnya, HasBrand dan isMaintenance

    void drive(); // Deklarasi Method Abstract drive()

    int getTire(); // Deklarasi method Abstract getTire()

    /**
     * Default Method
     * - Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki
     *   block method
     * - Namun sejak versi Java 8, ada fitur default method di interface
     * - Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang
     *   implement interface tersebut
     * - Ketika kita menambah satu method di interface, secara otomatis semua class yang di implement akan
     *   rusak karena harus meng-override method tersebut
     * - Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
     */
    default boolean isBig(){ // Implementasi default method isBig() yang mengembalikan nilai false
        return false;
    }

}
