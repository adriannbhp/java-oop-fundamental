public class ManagerApp {
    public static void main(String[] args) {

        // Membuat objek manager dengan menggunakan constructor Manager yang memiliki parameter name, age, dan salary
        var manager = new Manager("Adrian", 21, "25 Million"); // Menggunakan Parameter
        // manager.name = "Adrian"; // Pada contoh ini, jika menggunakan constructor dengan parameter, tidak perlu menginisialisasi nilai field secara terpisah
        manager.sayHello("Naizar"); // Memanggil method sayHello() pada objek manager dengan parameter "Naizar"

        // Membuat objek vp (Vice President) dengan menggunakan constructor VicePresident yang memiliki parameter name, age, dan salary
        var vp = new VicePresident("Bimo", 35,"50 Million"); // Menggunakan Parameter
        // vp.name = "Adrian"; // Pada contoh ini, jika menggunakan constructor dengan parameter, tidak perlu menginisialisasi nilai field secara terpisah
        vp.sayHello("Dilla"); // Memanggil method sayHello() pada objek vp dengan parameter "Dilla"

        /**
         * Object Class
         * - Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object
         * - Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otomatis
         *   Java akan membuat class kita extends Object
         * - Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java
         */
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());

    }
}
