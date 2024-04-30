package oop.java.fundamental.application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {
//                    "Adrian", "Bimo", "Hernawan Pratama"
//            };
//
//            System.out.println(names[100]);
//        }catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//            /**
//             * Error
//             * java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3 (Keterangan Error)
//             * 	at oop.java.fundamental.application.StackTraceApp.main(StackTraceApp.java:11) (Keterangan Lokasi & Baris error)
//             */

        try {
            sampleError();
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] names = {
                    "Adrian", "Bimo", "Hernawan Pratama"
            };

            System.out.println(names[100]);
        }catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
