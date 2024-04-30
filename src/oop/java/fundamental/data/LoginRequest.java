package oop.java.fundamental.data;

public record LoginRequest(String username, String password) {

    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

//    public void setUsername(String username) {
//        this.username = username; // Cannot assign a value to final variable 'username'
//    }
}
