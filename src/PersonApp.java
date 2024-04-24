public class PersonApp {
    /**
     * Membuat Object
     * - Object adalah hasil instansiasi dari sebuah class
     * - Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan
     *   nama Class kurung ()
     */
    public static void main(String[] args) {

//        // Manipulasi Field (dari Class Person)
//        var person = new Person();
//        person.name = "Adrian Bimo Hernawan Pratama";
//        person.address = "Bandung";
//        // person.country = "Australia"; // ERROR (Karena menggunakan variable Final0
//
//        System.out.println(person.name); // Output : Adrian Bimo Hernawan Pratama
//        System.out.println(person.address);
//        System.out.println(person.country);
//
//        // Mengases Method sayHello()
//        person.sayHello("Dilla"); // Output : Hello Dilla, My Name is adrianbhp
//
//        // Membuat objek person2 dan mengakses method sayHello() tanpa menetapkan nilai untuk field 'name'
//        Person person2;
//        person2 = new Person();
//        person2.sayHello("Dilla"); // Output : Hello dilla, My Name is null
//
//        // Mengakses method sayHello() dengan menetapkan nilai untuk field 'name' yaitu 'Bimo'
//        person2 = new Person();
//        person2.name = "Bimo";
//        person2.sayHello("Dilla"); // Output : Hello Dilla, My Name is Bimo

        // Menggunakan Constructor

        // Manipulasi Field (dari Class Person)
        var person = new Person("Adrian Bimo Hernawan Pratama", "Bandung");

        System.out.println(person.name); // Output : Adrian Bimo Hernawan Pratama
        System.out.println(person.address); // Output : Bandung
        System.out.println(person.country); // Output : Indonesia

        // Mengakses Method sayHello()
        person.sayHello("Naizar"); // Output : Hello Naizar, My Name is Adrian Bimo Hernawan Pratama

        // Membuat object person2 dan mengakses method sayHello() tanpa menetapkan nilai untuk field 'name'
        Person person2;
        person2 = new Person("Adrian", "Bandung Timur");
        person2.sayHello("Dilla"); // Output : Hello Dilla, My Name is Adrian

    }
}
