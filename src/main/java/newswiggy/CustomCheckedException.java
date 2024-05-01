package newswiggy;

public class CustomCheckedException extends Exception{
    String errorCode;

    public CustomCheckedException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
