package oop.java.fundamental.data;

/**
 * Encapsulation
 * - Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
 * - Hal ini bertujuan agar kita bisa menjada data sebuah object tetap baik dan valid
 * - Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier
 *   private, sehingga tidak bisa diakses atau diubah dari luar
 * - Agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tsb
 */

/**
 * Getter dan Setter
 * - Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan
 *   Getter dan Setter method
 * - Getter adalah function yang dibuat untuk mengambil data field
 * - Setter ada function untuk mengubah data field
 *
 * Getter dan Setter Method
 *
 * Tipe Data            Getter Method          Setter Method
 * - Boolean            isXxx()                setXxx(boolean value)
 * - primitif           getXxx()               setXxx(primitif value)
 * - Object             getXxx()               setXxx(Object value)
 */
public class Category {

    private String id; // Mendeklarasikan field String 'id' sebagai private

    private boolean exspensive; // Mendeklarasikan field boolean 'exspensive' sebagai private

    public String getId() { // Method getter untuk mengambil nilai field 'id'
        return id;
    }

    public void setId(String id) { // Method setter untuk mengatur nilai field 'id'
        // Menambahkan Validation di Setter
        if(id != null){
            this.id = id; // Mengatur nilai field 'id' hanya jika inputnya tidak null
        }
    }

    public boolean isExspensive() { // Method getter untuk mengambil nilai field 'exspensive'
        return exspensive;
    }

    public void setExspensive(boolean exspensive) { // Method setter untuk mengatur nilai field 'exspensive'
        this.exspensive = exspensive; // Mengatur nilai field 'exspensive' dengan nilai yang diberikan
    }
}
