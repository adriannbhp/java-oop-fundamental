class Parent {
    String name;
    void doIt(){
        System.out.println("Do it in parent");
    }
}

/**
 * Class Child merupakan turunan dari Parent dgn attribute 'name' yang di-shadowed (ditimpa)
 * dan Method 'doIt' yang mencetak "Do it in child"
 */
class Child extends Parent{
    String name; // Shadowing attribute 'name' dari Class Parent
    void doIt(){
        System.out.println("Do it in child");
        // Mengakses dari Class Parent 'name' menggunakan super
        System.out.println(STR."Parent name is \{super.name}");
    }
}

