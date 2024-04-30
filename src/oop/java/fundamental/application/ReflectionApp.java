package oop.java.fundamental.application;

import oop.java.fundamental.data.CreateUserRequest;
import oop.java.fundamental.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {


        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("adrian");
        request.setPassword("adrian");

        ValidationUtil.validationReflection(request);
    }
}
