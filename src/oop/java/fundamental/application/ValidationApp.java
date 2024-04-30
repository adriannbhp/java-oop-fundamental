package oop.java.fundamental.application;

import oop.java.fundamental.annotation.Fancy;
import oop.java.fundamental.data.LoginRequest;
import oop.java.fundamental.error.ValidationException;
import oop.java.fundamental.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "ValdationApp", tags = {"application", "java"})
    public static void main(String[] args) {


//        LoginRequest loginRequest = new LoginRequest(null, null); // Output : Data tidak valid : Username is null
//        LoginRequest loginRequest = new LoginRequest("adrian", "apajah"); // Output : Data valid
        LoginRequest loginRequest = new LoginRequest(null, "rahasia"); // Output : Data tidak valid : Username is blank

//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        } catch (ValidationException exception) {
//            System.out.println("Data tidak valid : " + exception.getMessage());
//        } catch (NullPointerException exception) {
//            System.out.println("Data null : " + exception.getMessage());
//        }
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Error gak error, tetep dipanggil yhhh");
        }

        // Tanpa Try Catch
//        LoginRequest loginRequest2 = new LoginRequest(null, null);
//        ValidationUtil.validateRuntime(loginRequest2);
//        System.out.println("Sukses");
        /**
         * Perlu Diperhatikan
         * - Walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya kita tetap melakukan
         *   try-catch
         * - Karena jika terjadi runtime exception, yang ditakutkan adalah program kita berhenti
         */
    }
}
