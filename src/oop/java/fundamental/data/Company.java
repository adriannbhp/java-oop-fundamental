package oop.java.fundamental.data;

/**
 * Inner Class
 * - Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class
 * - Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class
 *   yang saling berhubungan, dimana sebuah class tidak bisa dibuat tanpa class lain
 * - Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa
 *   membuat class Employee sebagai inner class company
 * - Cara membuat inner class, cukup membuatnya di dalam block class outter class nya
 */
public class Company { // Declaration of the Company Class

    private String name; // Private field

    public String getName() { // Getter method for 'name' field
        return name;
    }

    public void setName(String name) { // Setter method for 'name' field
        this.name = name;
    }

    public class Employee { // Declaration of the inner class Employee

        private String name; // Private field

        public String getCompany(){ // Method to get the name of the company
            return  Company.this.name; // Accessing the 'name' field of the outer class
        }

        public String getName() { // Getter method for 'name' field
            return name;
        }

        public void setName(String name) { // Setter method for 'name' field
            this.name = name;
        }
    }
}
