package oop.java.fundamental.application;

import oop.java.fundamental.data.Category;

public class CategoryApp {
    public static void main(String[] args) {


        var category = new Category(); // Membuat instance baru dari class Category
        category.setId("ID"); // Mengatur nilai field 'id' dari object category menjadi "ID"
        category.setId(null); // Mencoba mengatur nilai field 'id' menjadi null, tetapi tidak akan berubah karena adanya validasi di setter
//        category.id = null; // // Baris ini akan menyebabkan error kompilasi karena 'id' bersifat private dan tidak dapat diakses secara langsung
        System.out.println(category.getId()); // Mencetak nilai field 'id'
    }
}
