import static java.lang.StringTemplate.STR;

class Employee {

    /**
     * Polymorphism
     * - Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
     * - Dalam OOP, Polymorphism adalah kemampuan object berubah bentuk menjadi
     *   bentuk lain
     * - Polymorphism erat hubungannya dengan inheritance
     */
    String name;

    // field 'age' yang menyimpan umur manager
    int age;

    // Field 'salary' yang menyimpan gaji manager
    String salary;

    Employee(String name, int age, String salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void sayHello(String name) {
        System.out.println(STR."Hi \{name}, My Name is Employee \{this.name} \{this.age} y.o, and My salary is \{this.salary}");
    }
}
