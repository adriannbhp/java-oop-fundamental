/**
 * Membuat Class
 * - Untuk Membuat Class, kita bisa menggunakan kata kunci class
 * - Penamaan class biasa menggunakan format CamelCase (contoh 'firstName')
 */

public class Person {
    /**
     * Field
     * - Fields /Properties /Attributes adalah data yang bisa kita sisipkan di dalam Object
     * - Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan
     *   data apa saja yang dimiliki object tersebut di dalam deklarasi class-nya
     * - Membuat field sama seperti membuat variable, namun ditempatkan di block class
     */

    // Membuat Field
    String name;
    String address;
    final String country = "Indonesia"; // keyword final tidak dapat diubah mirip seperti const

    /**
     * Constructor
     * - Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita
     *   menggunakan kurung ()
     * - Di dalam class Java, kita bisa membuat constructor, constructor adalah method yang
     *   akan dipanggil saat pertama kali Object dibuat.
     * - Mirip seperti di method, kita bisa memberi parameter pada constructor
     * - Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci
     *   void atau return value
     */

    // Membuat Constructor
    Person(String name, String address){
        /**
         * Variable Shadowing
         * - Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang
         *   sama di scope yang menutupi variable dengan nama yang sama di scope di atasnya
         * - Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di
         *   class
         * - Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa
         *   diakses
         */

        // Variable Shadowing
        // Property name dan address mengacu kepada method parameter sehingga outputnya null
         name = name; // Output : null
         address = address; // Output : null

        /**
         * This Keywoard
         * - Saat kita membuat kode di dalam constructor atau method di dalam class, kita bisa menggunakan
         *   kata kunci this untuk mengakses object saat ini
         * - Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method,
         *   hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tsb
         *   dengan kata kunci this (contoh : this.name)
         * - This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan
         *   untuk mengakses method
         * - This bisa digunakan untuk mengatasi masalah variable shadowing
         */

        // This Keywoard
         this.name = name; // Output : Adrian Bimo Hernawan Pratama
         this.address = address; // Output : Bandung
    }

    /**
     * Constructor Overloading
     * - Sama seperti di method, di constructor pun kita bisa melakukan overloading
     * - Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter
     *   harus berbeda, atau jumlah parameter harus berbeda
     */

    // Constructor Overloading

    // Constructor dengan parameter
    Person(String paramName){
        /**
         * Memanggil Constructor Lain
         * - Constructor bisa memanggil constructor lain
         * - Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
         * - Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil
         *   method, namun dengan kata kunci this
         */
        // Memanggil Constructor Lain
        this(paramName, null);
    }

    // Constructor tanpa parameter
    Person(){
        this(null);
    }

    // void tidak mengembalikan data apapun
    void sayHello(String name) {
        // Mengeluarkan pesan salam dengan memasukkan nama dari parameter dan nama dari object ini
        // System.out.println("Hello " + paramName + ", My Name is " + name);

        // Menggunakan String Template (Java 15+)
        System.out.println(STR."Hello \{name}, My Name is \{this.name}");
    }
}


