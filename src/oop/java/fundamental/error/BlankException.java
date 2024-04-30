package oop.java.fundamental.error;

public class BlankException extends RuntimeException {

    @Deprecated
    public  BlankException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
