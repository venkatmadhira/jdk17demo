package swiggyapplatest;

public class CheckedException extends Exception{
    String code;
    public CheckedException(String message, String code) {
        super(message);
        this.code = code;
    }
}
