package oop.java.fundamental.data;

public class Bus implements Car{ // Mendeklarasikan kelas Bus yang mengimplementasikan interface Car

    public void drive() { // Implementasi method drive() dari interface Car
        System.out.println("Bus Drive");
    }

    public int getTire() { // Implementasi metod getTire() dari interface Car
        return 8;
    }

    public String getBrand() { // Implementasi method getBrand() dari interface HasBrand
        return "Hino";
    }


    public boolean isMaintenance() { // Implementasi method isMaintenance() dari interface isMaintenance
        return false;
    }

    public boolean isBig() { // Override method isBig() dengan mengembalikan nilai true
        return true;
    }
}
