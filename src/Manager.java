class Manager extends Employee{

    /**
     * Inheritance
     * - Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
     * - Dalam artian, kita bisa membuat class Parent dan class Child
     * - Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak
     *   class Child.
     * - Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara
     *   otomatis akan dimiliki oleh class Child
     * - Untuk melakukan pewarisan, di class Child, kita harus menggunakan kata kunci extends lalu
     *   diikuti dengan nama class parent nya
     */

    // Field company
    String company;

    // Menggunakan default constructor
    // Manager(){
    // }

    /**
     * Super Constructor
     * - Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga
     *   bisa digunakan untuk mengakses constructor
     * - Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class
     *   child constructor
     * - Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki
     *   default constructor), maka class child wajib mengakses constructor class parent tersebut
     */

    Manager(String name, int age, String salary){
        super(name, age, salary);
    }

    Manager(String name, int age, String salary, String company){
        super(name, age, salary);
        this.company= company;
    }


    // Method sayHello untuk mencetak pesan sapaan dengan nama manager, usia, dan gaji
    void sayHello(String name) {
        System.out.println(STR."Hi \{name}, My Name is Manager \{this.name} \{this.age} y.o, and My salary is \{this.salary}");
    }
}
