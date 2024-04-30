public class PolymorphismApp {
    public static void main(String[] args) {

        // Membuat Object Employee dengan nama "Adrian", usia 21, dan gaji "8 Juta"
        Employee employee = new Employee("Adrian", 21, "8 Million");
        // Memanggil Method sayHello dari object employee dengan parameter "Naizar"
        employee.sayHello("Naizar");

        // Membuat Object Employee dengan nama "Adrian", usia 21, dan gaji "12 Juta"
        employee = new Manager("Adrian", 21, "12 Million");
        // Memanggil Method sayHello dari object employee dengan parameter "Naizar"
        employee.sayHello("Naizar");

        // Membuat Object Employee dengan nama "Adrian", usia 21, dan gaji "15 Juta"
        employee = new VicePresident("Adrian", 21, "15 Million");
        // Memanggil Method sayHello dari object employee dengan parameter "Naizar"
        employee.sayHello("Naizar");

        // Memanggil Method sayHello dengan berbagai parameter jenis object Employee
        sayHello(new Employee("Adrian", 21, "15 Million"));
        sayHello(new Manager("Naizar", 18, "5"));
        sayHello(new VicePresident("Dilla", 20, "10"));
    }

    // Method Polymorphism
    static void sayHello(Employee employee) {
        /**
         * Type Check & Casts
         * - Sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif
         * - Casts juga bisa bisa digunakan untuk tipe data bukan primitif
         * - Namun agar aman, sebelumn melakukan casts, pastikan kita melakukan type check (pengecekan
         *   tipe data), dengan menggunakan kata kunci instanceof
         * - Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
         */
        if (employee instanceof  VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            // Mencetak pesan sapaan dengan mengakses attribute name, age, dan salary dari object employee yang diterima sebagai parameter
//            System.out.println(STR."Hello VP \{employee.name} \{employee.age} y.o, and My salary is \{employee.salary}");
            System.out.println(STR."Hello VP \{employee.name}"); // Output : Hello VP Dilla
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            // Mencetak pesan sapaan dengan mengakses attribute name, age, dan salary dari object employee yang diterima sebagai parameter
//            System.out.println(STR."Hello VP \{employee.name} \{employee.age} y.o, and My salary is \{employee.salary}");
            System.out.println(STR."Hello Manager \{employee.name}"); // Output : Hello Manager Naizar
        } else {
//            System.out.println(STR."Hello \{employee.name} \{employee.age} y.o, and My salary is \{employee.salary}");
            System.out.println(STR."Hello \{employee.name}"); // Output : Hello Adrian
        }
    }
}
