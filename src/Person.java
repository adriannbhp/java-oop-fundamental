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
     * - Membuat field sama seperti membuat variable, namun ditemaptkan di block class
     */

    String name;
    String address;
    final String country = "Indonesia";

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
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    /**
     * Constructor Overloading
     * - Sama seperti di method, di constructor pun kita bisa melakukan overloading
     * - Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter
     *   harus berbeda, atau jumlah parameter harus berbeda
     */

    // Constructor Overloading
    Person(String paramName){
        name = paramName;
    }

    Person(){
    }

    // void tidak mengembalikan data apapun
    void sayHello(String paramName) {
        // Mengeluarkan pesan salam dengan memasukkan nama dari parameter dan nama dari object ini
        // System.out.println("Hello " + paramName + ", My Name is " + name);
        // Menggunakan String Template (Java 15+)
        System.out.println(STR."Hello \{paramName}, My Name is \{name}");
    }
}


