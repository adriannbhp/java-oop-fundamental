package oop.java.fundamental.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Predefined Annotation
 * Java juga sudah memiliki annotation bawaan, seperti:
 * - @Override, untuk menandai bahwa method yang meng-override method parent class nya
 * - @Deprecated, untuk menandai bahwa method tsb tidak direkomendasikan lagi untuk digunakan
 * - FunctionlInterface, untuk menandai bahwa class tsb bisa dibuat sebagai lambda expression
 * - dan lain-lain
 */

// Membuat Annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name();

    String[] tags() default {};

}
