package oop.java.fundamental.application;

import oop.java.fundamental.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("adrian", "apaja");

        System.out.println(loginRequest.username()); // Output : adrian
        System.out.println(loginRequest.password()); // Output : apaja
        System.out.println(loginRequest); // Output : LoginRequest[username=adrian, password=apaja]

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("adrian"));
        System.out.println(new LoginRequest("adrian", "apaja"));
    }
}
