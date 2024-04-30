public class ParentApp {
    public static void main(String[] args) {

        /**
         * Ketika
         */

        // Membuat Object Child
        Child child = new Child();
        // Mengatur nilai attribute 'name' dari object Child
        child.name = "Adrian";
        // Memanggil method doIt() dari object Child yang akan mencetak "Do it in child"
        child.doIt(); // Output : Do it in child
        // Mencetak nilai attribute 'name' dari object Child
        System.out.println(child.name); // Output : Adrian

        /**
         * Tidak disarankan menggunakan nama variable yang sama di turunan
         */

        // Mengubah reference object Child menjadi reference Parent
        Parent parent = (Parent) child;
        // Memanggil method doIt() menggunakan reference Parent, namun yang akan dipanggil adalah method doIt()
        // dari Child, karena overriding
        parent.doIt(); // Output : Do it in child
        // Mencetak nilai attribute 'name' menggunakan reference Parent, karena tidak ada nilai yang di set di
        // Object Parent maka mencetak null
        System.out.println(parent.name); // Output : null
    }
}
