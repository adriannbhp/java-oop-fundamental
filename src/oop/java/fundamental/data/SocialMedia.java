package oop.java.fundamental.data;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Final Class
 * - Sebelumnya kita pernah menggunakan kata kunci final di Java
 * - Jika digunakan di variable, maka variable tsb tidak bisa berubah lagi data nya
 * - Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final
 *   sebelum class, maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi
 * - Secara otomatis semua class child nya akan error
 */
class SocialMedia {
    String name;
}

final class Facebook extends SocialMedia {

}

// ERROR karena Class Facebook final
//class FakeFacebook extends Facebook {
//
//}

class Instagram extends SocialMedia {
    /**
     * Final Method
     * - Kata kunci final juga bisa digunakan di Method
     * - Jika sebuah method kita tambahkan kata kunci final, maka artinya method tsb tidak bisa
     *   di override lagi di class child nya
     * - Ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa
     *   diubah lagi oleh class child nya
     */

    final void login(String username, String password){
        // isi Method
    }
}

class FakeInstagram extends Instagram {

//  ERROR : 'login(String, String)' cannot override 'login(String, String)' in 'oop.java.fundamental.data.Instagram'; overridden method is final
//    void login(String username, String password){
//        // isi method
//    }
}

