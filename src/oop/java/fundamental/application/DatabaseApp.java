package oop.java.fundamental.application;

import oop.java.fundamental.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
//        connectDatabase("adrian", "adrian");
        connectDatabase("adrian", null); // ERROR : Tidak bisa konek ke database
        System.out.println("Sukses");
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
