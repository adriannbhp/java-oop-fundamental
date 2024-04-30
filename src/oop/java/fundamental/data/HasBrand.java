package oop.java.fundamental.data;

/**
 * Interface Inheritance
 * - Sebelumnya kita sudah tahu kalo di Java, child class hanya bisa punya 1 class parent
 * - Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
 * - Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin
 *   mewarisi interface lain, kita bisa menggunakan kata kunci extends, bukan implements
 */
public interface HasBrand {

    String getBrand();
}
