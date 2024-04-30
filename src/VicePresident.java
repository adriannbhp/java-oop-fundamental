class VicePresident extends Manager {

    /**
     * VicePresident adalah subclass dari Manager. Ini terlihat dari penulisan baris kode class VicePresident extends
     * Manager. Dengan demikian, VicePresident merupakan turunan dari Manager, yang berarti VicePresident mewarisi
     * semua field dan method yang ada dalam Manager, dan memiliki kemampuan untuk menambahkan field dan method tambahan
     * yang khusus untuk VicePresident.
     */

    // Constructor VicePresident dengan parameter name, age, salary, mengakses constructor superclass Manager
    VicePresident(String name, int age, String salary){
        super(name, age, salary);
    }

//    VicePresident(String name, int age, String salary, String company){
//        super(name, age, salary, company);
//    }

    /**
     * Method Overriding
     * - Method overriding adalah kemampuan mendeklarasikan ulang method di child class,
     *   yang sudah ada di parent class
     * - Saat kita melakukan proses overriding tsb, secara otomatis ketika kita membuat
     *   object dari class child, method yang di class parent tidak bisa diakses lagi
     */

    // Mendeklarasikan Method sayHello() didalam class VicePresident yang mengoverrides method dari Class Manager
    void sayHello(String name) {
        System.out.println(STR."Hi \{name}, My Name is VP \{this.name} \{this.age} y.o, and My salary is \{this.salary}");
    }
}
